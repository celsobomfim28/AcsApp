package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.EquipeOutput;
import br.com.acs.Models.Equipe;
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
public class EquipeResponseMapperImpl implements EquipeResponseMapper {

    @Override
    public EquipeOutput toEquipeOutput(Equipe equipe) {
        if ( equipe == null ) {
            return null;
        }

        EquipeOutput equipeOutput = new EquipeOutput();

        equipeOutput.setIne( equipe.getIne() );
        equipeOutput.setNumero( equipe.getNumero() );

        equipeOutput.setCnes( equipe.getUnidade().getCnes() );

        return equipeOutput;
    }

    @Override
    public List<EquipeOutput> toEquipeOutputList(List<Equipe> equipes) {
        if ( equipes == null ) {
            return null;
        }

        List<EquipeOutput> list = new ArrayList<EquipeOutput>( equipes.size() );
        for ( Equipe equipe : equipes ) {
            list.add( toEquipeOutput( equipe ) );
        }

        return list;
    }
}
