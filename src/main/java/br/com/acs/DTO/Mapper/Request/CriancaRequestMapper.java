package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.CriancaInput;
import br.com.acs.Models.Crianca;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface CriancaRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertToEndereco(crianca.getIdEndereco()))", target = "endereco")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToTipoParto(crianca.getTipoParto()))",
            target = "tipoParto")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToRaca(crianca.getRaca()))",
            target = "raca")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToLocalDate(crianca.getDataNascimento()))",
            target = "dataNascimento")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToProfissional(crianca.getProfissional()))", target = "profissional")
    Crianca toCrianca(CriancaInput crianca);
}
