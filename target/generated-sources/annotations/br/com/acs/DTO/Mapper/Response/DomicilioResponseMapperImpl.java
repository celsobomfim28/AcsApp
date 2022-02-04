package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.DomicilioOutput;
import br.com.acs.Models.Domicilio;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:00-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DomicilioResponseMapperImpl implements DomicilioResponseMapper {

    @Override
    public DomicilioOutput toDomicilioOutput(Domicilio domicilio) {
        if ( domicilio == null ) {
            return null;
        }

        DomicilioOutput domicilioOutput = new DomicilioOutput();

        domicilioOutput.setTelefoneResidencial( domicilio.getTelefoneResidencial() );
        domicilioOutput.setTelefoneReferencial( domicilio.getTelefoneReferencial() );
        domicilioOutput.setNumeroMoradores( domicilio.getNumeroMoradores() );
        domicilioOutput.setNumeroComodos( domicilio.getNumeroComodos() );
        domicilioOutput.setEnergiaEletrica( domicilio.isEnergiaEletrica() );
        if ( domicilio.getTratamentoAgua() != null ) {
            domicilioOutput.setTratamentoAgua( domicilio.getTratamentoAgua().name() );
        }
        domicilioOutput.setAnimal( domicilio.isAnimal() );
        domicilioOutput.setQtdAnimal( domicilio.getQtdAnimal() );

        domicilioOutput.setSituacaoMoradia( domicilio.getSituacaoMoradia().name() );
        domicilioOutput.setTipoDomicilio( domicilio.getTipoDomicilio().name() );
        domicilioOutput.setAbastecimentoAgua( domicilio.getAbastecimentoAgua().name() );
        domicilioOutput.setAreaProdRural( domicilio.getAreaProdRural().name() );
        domicilioOutput.setDestinoLixo( domicilio.getDestinoLixo().name() );
        domicilioOutput.setFormaEscoamento( domicilio.getFormaEscoamento().name() );
        domicilioOutput.setMaterialConstrucao( domicilio.getMaterialConstrucao().name() );
        domicilioOutput.setLocalizacao( domicilio.getLocalizacao().name() );
        domicilioOutput.setTipoAcessoDomicilio( domicilio.getTipoAcessoDomicilio().name() );
        domicilioOutput.setTipoDeAnimal( ConvertResponse.convertTipoAnimalToStr(domicilio.getIdDomicilio()) );
        domicilioOutput.setEndereco( ConvertResponse.convertEnderecoToStr(domicilio.getIdDomicilio()) );

        return domicilioOutput;
    }

    @Override
    public List<DomicilioOutput> toDomicilioOutputList(List<Domicilio> domicilios) {
        if ( domicilios == null ) {
            return null;
        }

        List<DomicilioOutput> list = new ArrayList<DomicilioOutput>( domicilios.size() );
        for ( Domicilio domicilio : domicilios ) {
            list.add( toDomicilioOutput( domicilio ) );
        }

        return list;
    }
}
