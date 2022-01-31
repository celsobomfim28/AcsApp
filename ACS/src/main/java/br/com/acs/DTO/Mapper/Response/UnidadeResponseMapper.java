package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UnidadeResponseMapper {

    UnidadeOutput toUnidadeOutput(Unidade unidade);

    List<UnidadeOutput> toUnidadeOutputList(List<Unidade> unidades);
}
