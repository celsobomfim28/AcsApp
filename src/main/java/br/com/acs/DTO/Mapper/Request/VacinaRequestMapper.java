package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.VacinaInput;
import br.com.acs.Models.Vacina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface VacinaRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertToDose(vacina.getDose()))",
            target = "dose")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToTipoVacina(vacina.getTipoVacina()))",
            target = "tipoVacina")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToLocalDate(vacina.getDataAplicacao()))",
            target = "dataAplicacao")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToCrianca(vacina.getCrianca()))", target = "crianca")
    Vacina toVacina(VacinaInput vacina);
}
