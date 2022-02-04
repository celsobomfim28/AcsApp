package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.AnimalInput;
import br.com.acs.Models.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface AnimalRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertIdToDomicilio(animal.getIdDomicilio()))",
            target = "domicilio")
    @Mapping(expression =
            "java(ConverterIdToObject.convertStrToEnum(animal.getTipoAnimal()))",
            target = "tipoAnimal")
    Animal toAnimal(AnimalInput animal);
}
