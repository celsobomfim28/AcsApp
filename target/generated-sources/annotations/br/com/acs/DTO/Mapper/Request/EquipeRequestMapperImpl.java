package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.EquipeInput;
import br.com.acs.Models.Equipe;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:01-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class EquipeRequestMapperImpl implements EquipeRequestMapper {

    @Override
    public Equipe toEquipe(EquipeInput equipe) {
        if ( equipe == null ) {
            return null;
        }

        Equipe equipe1 = new Equipe();

        equipe1.setIne( equipe.getIne() );
        equipe1.setNumero( equipe.getNumero() );

        equipe1.setUnidade( ConverterIdToObject.convertToUnidade(equipe.getIdUnidade()) );

        return equipe1;
    }
}
