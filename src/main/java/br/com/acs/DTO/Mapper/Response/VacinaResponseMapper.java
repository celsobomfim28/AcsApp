package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Input.VacinaInput;
import br.com.acs.Models.Vacina;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        imports = ConvertResponse.class)
public interface VacinaResponseMapper {

    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(vacina.getDataAplicacao()))", target = "dataAplicacao")
    @Mapping(expression = "java(vacina.getCrianca().getIdCrianca())", target = "crianca")
    @Mapping(expression = "java(vacina.getDose().name())", target = "dose")
    @Mapping(expression = "java(vacina.getTipoVacina().name())", target = "tipoVacina")
    VacinaInput toVacinaOutput(Vacina vacina);
    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(vacina.getDataAplicacao()))", target = "dataAplicacao")
    @Mapping(expression = "java(vacina.getCrianca().getIdCrianca())", target = "crianca")
    @Mapping(expression = "java(vacina.getDose().name())", target = "dose")
    @Mapping(expression = "java(vacina.getTipoVacina().name())", target = "tipoVacina")
    List<VacinaInput> toVacinaOutputList(List<Vacina> list);
}
