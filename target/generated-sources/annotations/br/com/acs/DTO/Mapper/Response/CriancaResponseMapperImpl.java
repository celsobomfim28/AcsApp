package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.CriancaOutput;
import br.com.acs.Models.Crianca;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T08:45:50-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CriancaResponseMapperImpl implements CriancaResponseMapper {

    @Override
    public List<CriancaOutput> toCriancaOutputList(List<Crianca> list) {
        if ( list == null ) {
            return null;
        }

        List<CriancaOutput> list1 = new ArrayList<CriancaOutput>( list.size() );
        for ( Crianca crianca : list ) {
            list1.add( toCriancaOutput( crianca ) );
        }

        return list1;
    }

    @Override
    public CriancaOutput toCriancaOutput(Crianca crianca) {
        if ( crianca == null ) {
            return null;
        }

        CriancaOutput criancaOutput = new CriancaOutput();

        criancaOutput.setNome( crianca.getNome() );
        criancaOutput.setSus( crianca.getSus() );
        criancaOutput.setLocalNascimento( crianca.getLocalNascimento() );
        criancaOutput.setNomeMae( crianca.getNomeMae() );
        criancaOutput.setNomePai( crianca.getNomePai() );
        criancaOutput.setTelefone( crianca.getTelefone() );
        criancaOutput.setPesoAoNascer( crianca.getPesoAoNascer() );
        criancaOutput.setPerimetroCefalico( crianca.getPerimetroCefalico() );
        criancaOutput.setComprimentoAoNascer( crianca.getComprimentoAoNascer() );
        criancaOutput.setApgar( crianca.getApgar() );

        criancaOutput.setProfissional( crianca.getProfissional().getIdProfissional() );
        criancaOutput.setTipoParto( crianca.getTipoParto().name() );
        criancaOutput.setRaca( crianca.getRaca().name() );
        criancaOutput.setEndereco( ConvertResponse.convertEnderecoToStr(crianca.getEndereco().getIdEndereco()) );
        criancaOutput.setDataNascimento( ConvertResponse.convertLocalDateToStr(crianca.getDataNascimento()) );

        return criancaOutput;
    }
}
