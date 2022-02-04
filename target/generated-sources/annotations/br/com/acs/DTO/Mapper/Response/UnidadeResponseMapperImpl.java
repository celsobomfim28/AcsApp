package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:01-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UnidadeResponseMapperImpl implements UnidadeResponseMapper {

    @Override
    public UnidadeOutput toUnidadeOutput(Unidade unidade) {
        if ( unidade == null ) {
            return null;
        }

        UnidadeOutput unidadeOutput = new UnidadeOutput();

        unidadeOutput.setNome( unidade.getNome() );
        unidadeOutput.setCnes( unidade.getCnes() );

        return unidadeOutput;
    }

    @Override
    public List<UnidadeOutput> toUnidadeOutputList(List<Unidade> unidades) {
        if ( unidades == null ) {
            return null;
        }

        List<UnidadeOutput> list = new ArrayList<UnidadeOutput>( unidades.size() );
        for ( Unidade unidade : unidades ) {
            list.add( toUnidadeOutput( unidade ) );
        }

        return list;
    }
}
