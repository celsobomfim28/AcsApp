package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.PesoInput;
import br.com.acs.Models.Peso;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T08:45:50-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class PesoRequestMapperImpl implements PesoRequestMapper {

    @Override
    public Peso toPeso(PesoInput peso) {
        if ( peso == null ) {
            return null;
        }

        Peso peso1 = new Peso();

        peso1.setDataPeso( ConverterIdToObject.convertToLocalDate(peso.getDataPeso()) );
        peso1.setCrianca( ConverterIdToObject.convertToCrianca(peso.getCrianca()) );
        peso1.setIdadeEmMeses( ConverterIdToObject.convertToIdade(peso.getCrianca(), peso.getDataPeso()) );
        peso1.setPeso( ConverterIdToObject.setPeso(peso.getPeso()) );

        return peso1;
    }
}
