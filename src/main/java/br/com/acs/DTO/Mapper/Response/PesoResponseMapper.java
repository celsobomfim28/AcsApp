package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.PesoOutput;
import br.com.acs.Models.Peso;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        imports = ConvertResponse.class)
public interface PesoResponseMapper {

    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(peso.getDataPeso()))", target = "dataPeso")
    @Mapping(expression = "java(peso.getCrianca().getIdCrianca())", target = "crianca")
    PesoOutput toPesoOutput(Peso peso);
    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(peso.getDataPeso()))", target = "dataPeso")
    @Mapping(expression = "java(peso.getCrianca().getIdCrianca())", target = "crianca")
    List<PesoOutput> toPesoOutputList(List<Peso> pesos);
}
