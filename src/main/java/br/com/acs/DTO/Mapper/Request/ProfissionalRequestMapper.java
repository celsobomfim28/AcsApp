package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.ProfissionalInput;
import br.com.acs.Models.Profissional;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface ProfissionalRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertToEquipe(profissional.getIdEquipe()))", target = "equipe")
    Profissional toProfissional(ProfissionalInput profissional);
}
