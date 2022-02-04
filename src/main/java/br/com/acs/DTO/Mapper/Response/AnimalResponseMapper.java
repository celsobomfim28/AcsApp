package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Input.AnimalInput;
import br.com.acs.Models.Animal;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AnimalResponseMapper {

    AnimalInput toAnimalInput(Animal animal);
}
