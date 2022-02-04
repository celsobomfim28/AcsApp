package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.ProfissionalInput;
import br.com.acs.Models.Profissional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:01-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ProfissionalRequestMapperImpl implements ProfissionalRequestMapper {

    @Override
    public Profissional toProfissional(ProfissionalInput profissional) {
        if ( profissional == null ) {
            return null;
        }

        Profissional profissional1 = new Profissional();

        profissional1.setCns( profissional.getCns() );
        profissional1.setNome( profissional.getNome() );
        profissional1.setMicroarea(profissional.getMicroarea() );
        profissional1.setPassword(profissional.getPassword() );

        profissional1.setEquipe( ConverterIdToObject.convertToEquipe(profissional.getIdEquipe()) );

        return profissional1;
    }
}
