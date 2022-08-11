package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.PesoOutput;
import br.com.acs.Models.Peso;
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
public class PesoResponseMapperImpl implements PesoResponseMapper {

    @Override
    public PesoOutput toPesoOutput(Peso peso) {
        if ( peso == null ) {
            return null;
        }

        PesoOutput pesoOutput = new PesoOutput();

        pesoOutput.setIdadeEmMeses( String.valueOf( peso.getIdadeEmMeses() ) );

        pesoOutput.setDataPeso( ConvertResponse.convertLocalDateToStr(peso.getDataPeso()) );
        pesoOutput.setCrianca( peso.getCrianca().getIdCrianca() );

        return pesoOutput;
    }

    @Override
    public List<PesoOutput> toPesoOutputList(List<Peso> pesos) {
        if ( pesos == null ) {
            return null;
        }

        List<PesoOutput> list = new ArrayList<PesoOutput>( pesos.size() );
        for ( Peso peso : pesos ) {
            list.add( toPesoOutput( peso ) );
        }

        return list;
    }
}
