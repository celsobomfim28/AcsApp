package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.PesoInput;
import br.com.acs.Models.Peso;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface PesoRequestMapper {
    @Mapping(expression =
            "java(ConverterIdToObject.convertToLocalDate(peso.getDataPeso()))",
            target = "dataPeso")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToCrianca(peso.getCrianca()))", target = "crianca")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToIdade(peso.getCrianca(), peso.getDataPeso()))", target = "idadeEmMeses")
    @Mapping(expression =
            "java(ConverterIdToObject.setPeso(peso.getPeso()))", target = "peso")
    Peso toPeso(PesoInput peso);
}
