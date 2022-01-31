package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnidadeRequestMapper {

    Unidade toUnidade(UnidadeOutput unidadeOutput);
}
