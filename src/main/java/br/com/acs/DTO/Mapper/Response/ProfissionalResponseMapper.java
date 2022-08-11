package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.ProfissionalOutput;
import br.com.acs.Models.Profissional;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProfissionalResponseMapper {

    @Mapping(expression = "java(profissional.getEquipe().getIne())", target = "ine")
    @Mapping(expression = "java(profissional.getEquipe().getNumero())", target = "numeroEquipe")
    @Mapping(expression = "java(profissional.getEquipe().getUnidade().getNome())", target = "nomeUnidade")
    @Mapping(expression = "java(profissional.getEquipe().getUnidade().getCnes())", target = "cnes")
    ProfissionalOutput toProfissionalOutput(Profissional profissional);

    @Mapping(expression = "java(profissional.getEquipe().getIne())", target = "ine")
    @Mapping(expression = "java(profissional.getEquipe().getNumero())", target = "numeroEquipe")
    @Mapping(expression = "java(profissional.getEquipe().getUnidade().getNome())", target = "nomeUnidade")
    @Mapping(expression = "java(profissional.getEquipe().getUnidade().getCnes())", target = "cnes")
    List<ProfissionalOutput> toProfissionalOutputList(List<Profissional> profissionals);
}
