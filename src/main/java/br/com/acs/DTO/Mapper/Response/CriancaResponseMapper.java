package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Input.CriancaInput;
import br.com.acs.DTO.Output.CriancaOutput;
import br.com.acs.Models.Crianca;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        imports = ConvertResponse.class)
public interface CriancaResponseMapper {

    @Mapping(expression = "java(crianca.getProfissional().getIdProfissional())", target = "profissional")
    @Mapping(expression = "java(crianca.getTipoParto().name())", target = "tipoParto")
    @Mapping(expression = "java(crianca.getRaca().name())", target = "raca")
    @Mapping(expression =
            "java(ConvertResponse.convertEnderecoToStr(crianca.getEndereco().getIdEndereco()))", target = "endereco")
    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(crianca.getDataNascimento()))", target = "dataNascimento")
    List<CriancaOutput> toCriancaOutputList(List<Crianca> list);

    @Mapping(expression = "java(crianca.getProfissional().getIdProfissional())", target = "profissional")
    @Mapping(expression = "java(crianca.getTipoParto().name())", target = "tipoParto")
    @Mapping(expression = "java(crianca.getRaca().name())", target = "raca")
    @Mapping(expression =
            "java(ConvertResponse.convertEnderecoToStr(crianca.getEndereco().getIdEndereco()))", target = "endereco")
    @Mapping(expression =
            "java(ConvertResponse.convertLocalDateToStr(crianca.getDataNascimento()))", target = "dataNascimento")
    CriancaOutput toCriancaOutput(Crianca crianca);


}
