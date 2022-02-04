package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.DomicilioInput;
import br.com.acs.Models.Domicilio;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:28:59-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DomicilioRequestMapperImpl implements DomicilioRequestMapper {

    @Override
    public Domicilio toDomicilio(DomicilioInput domicilio) {
        if ( domicilio == null ) {
            return null;
        }

        Domicilio domicilio1 = new Domicilio();

        domicilio1.setTelefoneResidencial( domicilio.getTelefoneResidencial() );
        domicilio1.setTelefoneReferencial( domicilio.getTelefoneReferencial() );
        domicilio1.setNumeroMoradores( domicilio.getNumeroMoradores() );
        domicilio1.setNumeroComodos( domicilio.getNumeroComodos() );
        domicilio1.setEnergiaEletrica( domicilio.isEnergiaEletrica() );
        domicilio1.setAnimal( domicilio.isAnimal() );
        domicilio1.setQtdAnimal( domicilio.getQtdAnimal() );

        domicilio1.setSituacaoMoradia( ConverterIdToObject.convertToSituacaoMoradia(domicilio.getSituacaoMoradia()) );
        domicilio1.setAreaProdRural( ConverterIdToObject.convertToAreaProdRural(domicilio.getAreaProdRural()) );
        domicilio1.setDestinoLixo( ConverterIdToObject.convertToDestinoLixo(domicilio.getDestinoLixo()) );
        domicilio1.setAbastecimentoAgua( ConverterIdToObject.convertToAbastecimentoAgua(domicilio.getAbastecimentoAgua()) );
        domicilio1.setFormaEscoamento( ConverterIdToObject.convertToFormaEscoamento(domicilio.getFormaEscoamento()) );
        domicilio1.setLocalizacao( ConverterIdToObject.convertToLocalizacao(domicilio.getLocalizacao()) );
        domicilio1.setMaterialConstrucao( ConverterIdToObject.convertToMaterialConstrucao(domicilio.getMaterialConstrucao()) );
        domicilio1.setTipoAcessoDomicilio( ConverterIdToObject.convertToTipoAcessoDomicilio(domicilio.getTipoAcessoDomicilio()) );
        domicilio1.setTratamentoAgua( ConverterIdToObject.convertToTratamentoAgua(domicilio.getTratamentoAgua()) );
        domicilio1.setTipoDomicilio( ConverterIdToObject.convertToTipoDomicilio(domicilio.getTipoDomicilio()) );

        return domicilio1;
    }
}
