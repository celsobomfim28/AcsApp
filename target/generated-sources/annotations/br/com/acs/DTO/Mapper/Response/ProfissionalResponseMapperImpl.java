package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.ProfissionalOutput;
import br.com.acs.Models.Profissional;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:28:59-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ProfissionalResponseMapperImpl implements ProfissionalResponseMapper {

    @Override
    public ProfissionalOutput toProfissionalOutput(Profissional profissional) {
        if ( profissional == null ) {
            return null;
        }

        ProfissionalOutput profissionalOutput = new ProfissionalOutput();

        profissionalOutput.setCns( profissional.getCns() );
        profissionalOutput.setNome( profissional.getNome() );
        profissionalOutput.setMicroarea( profissional.getMicroarea() );

        return profissionalOutput;
    }

    @Override
    public List<ProfissionalOutput> toProfissionalOutputList(List<Profissional> profissionals) {
        if ( profissionals == null ) {
            return null;
        }

        List<ProfissionalOutput> list = new ArrayList<ProfissionalOutput>( profissionals.size() );
        for ( Profissional profissional : profissionals ) {
            list.add( toProfissionalOutput( profissional ) );
        }

        return list;
    }
}
