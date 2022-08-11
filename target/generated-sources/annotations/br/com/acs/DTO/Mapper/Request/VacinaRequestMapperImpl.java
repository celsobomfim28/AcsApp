package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.VacinaInput;
import br.com.acs.Models.Vacina;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T08:45:50-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class VacinaRequestMapperImpl implements VacinaRequestMapper {

    @Override
    public Vacina toVacina(VacinaInput vacina) {
        if ( vacina == null ) {
            return null;
        }

        Vacina vacina1 = new Vacina();

        vacina1.setLote( vacina.getLote() );

        vacina1.setDose( ConverterIdToObject.convertToDose(vacina.getDose()) );
        vacina1.setTipoVacina( ConverterIdToObject.convertToTipoVacina(vacina.getTipoVacina()) );
        vacina1.setDataAplicacao( ConverterIdToObject.convertToLocalDate(vacina.getDataAplicacao()) );
        vacina1.setCrianca( ConverterIdToObject.convertToCrianca(vacina.getCrianca()) );

        return vacina1;
    }
}
