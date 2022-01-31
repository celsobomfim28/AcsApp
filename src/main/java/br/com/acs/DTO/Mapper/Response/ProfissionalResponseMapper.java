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

    ProfissionalOutput toProfissionalOutput(Profissional profissional);

    List<ProfissionalOutput> toProfissionalOutputList(List<Profissional> profissionals);
}
