package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.EquipeOutput;
import br.com.acs.Models.Equipe;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EquipeResponseMapper {

    @Mapping(expression = "java(equipe.getUnidade().getCnes())", target = "cnes")
    EquipeOutput toEquipeOutput(Equipe equipe);

    @Mapping(expression = "java(equipe.getUnidade().getCnes())", target = "cnes")
    List<EquipeOutput> toEquipeOutputList(List<Equipe> equipes);
}
