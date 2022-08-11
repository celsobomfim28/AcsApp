package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Input.VacinaInput;
import br.com.acs.Models.Vacina;
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
public class VacinaResponseMapperImpl implements VacinaResponseMapper {

    @Override
    public VacinaInput toVacinaOutput(Vacina vacina) {
        if ( vacina == null ) {
            return null;
        }

        VacinaInput vacinaInput = new VacinaInput();

        vacinaInput.setLote( vacina.getLote() );

        vacinaInput.setDataAplicacao( ConvertResponse.convertLocalDateToStr(vacina.getDataAplicacao()) );
        vacinaInput.setCrianca( vacina.getCrianca().getIdCrianca() );
        vacinaInput.setDose( vacina.getDose().name() );
        vacinaInput.setTipoVacina( vacina.getTipoVacina().name() );

        return vacinaInput;
    }

    @Override
    public List<VacinaInput> toVacinaOutputList(List<Vacina> list) {
        if ( list == null ) {
            return null;
        }

        List<VacinaInput> list1 = new ArrayList<VacinaInput>( list.size() );
        for ( Vacina vacina : list ) {
            list1.add( toVacinaOutput( vacina ) );
        }

        return list1;
    }
}
