package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-31T00:35:51-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UnidadeRequestMapperImpl implements UnidadeRequestMapper {

    @Override
    public Unidade toUnidade(UnidadeOutput unidadeOutput) {
        if ( unidadeOutput == null ) {
            return null;
        }

        Unidade unidade = new Unidade();

        unidade.setNome( unidadeOutput.getNome() );
        unidade.setCnes( unidadeOutput.getCnes() );

        return unidade;
    }
}
