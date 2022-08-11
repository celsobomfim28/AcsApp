package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.CriancaInput;
import br.com.acs.Models.Crianca;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T08:45:50-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CriancaRequestMapperImpl implements CriancaRequestMapper {

    @Override
    public Crianca toCrianca(CriancaInput crianca) {
        if ( crianca == null ) {
            return null;
        }

        Crianca crianca1 = new Crianca();

        crianca1.setNome( crianca.getNome() );
        crianca1.setSus( crianca.getSus() );
        crianca1.setLocalNascimento( crianca.getLocalNascimento() );
        crianca1.setNomeMae( crianca.getNomeMae() );
        crianca1.setNomePai( crianca.getNomePai() );
        crianca1.setTelefone( crianca.getTelefone() );
        crianca1.setPesoAoNascer( crianca.getPesoAoNascer() );
        crianca1.setPerimetroCefalico( crianca.getPerimetroCefalico() );
        crianca1.setComprimentoAoNascer( crianca.getComprimentoAoNascer() );
        crianca1.setApgar( crianca.getApgar() );

        crianca1.setEndereco( ConverterIdToObject.convertToEndereco(crianca.getIdEndereco()) );
        crianca1.setTipoParto( ConverterIdToObject.convertToTipoParto(crianca.getTipoParto()) );
        crianca1.setRaca( ConverterIdToObject.convertToRaca(crianca.getRaca()) );
        crianca1.setDataNascimento( ConverterIdToObject.convertToLocalDate(crianca.getDataNascimento()) );
        crianca1.setProfissional( ConverterIdToObject.convertToProfissional(crianca.getProfissional()) );

        return crianca1;
    }
}
