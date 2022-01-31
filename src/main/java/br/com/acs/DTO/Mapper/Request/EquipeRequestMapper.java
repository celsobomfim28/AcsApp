package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.EquipeInput;
import br.com.acs.DTO.Output.EquipeOutput;
import br.com.acs.Models.Equipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface EquipeRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertToUnidade(equipe.getIdUnidade()))", target = "unidade")
    Equipe toEquipe(EquipeInput equipe);
}
