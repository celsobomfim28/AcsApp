package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.AnimalInput;
import br.com.acs.Models.Animal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:00-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class AnimalRequestMapperImpl implements AnimalRequestMapper {

    @Override
    public Animal toAnimal(AnimalInput animal) {
        if ( animal == null ) {
            return null;
        }

        Animal animal1 = new Animal();

        animal1.setDomicilio( ConverterIdToObject.convertIdToDomicilio(animal.getIdDomicilio()) );
        animal1.setTipoAnimal( ConverterIdToObject.convertStrToEnum(animal.getTipoAnimal()) );

        return animal1;
    }
}
