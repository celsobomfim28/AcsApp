package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Input.AnimalInput;
import br.com.acs.Models.Animal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:28:58-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class AnimalResponseMapperImpl implements AnimalResponseMapper {

    @Override
    public AnimalInput toAnimalInput(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalInput animalInput = new AnimalInput();

        if ( animal.getTipoAnimal() != null ) {
            animalInput.setTipoAnimal( animal.getTipoAnimal().name() );
        }

        return animalInput;
    }
}
