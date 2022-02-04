package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.EnderecoInput;
import br.com.acs.Models.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface EnderecoRequestMapper {


    @Mapping(expression =
            "java(ConverterIdToObject.convertToTipoLogradouro(endereco.getTipoLogradouro()))",
            target = "tipoLogradouro")
    @Mapping(expression =
            "java(ConverterIdToObject.convertIdToDomicilio(endereco.getIdDomicilio()))",
            target = "domicilio")
    @Mapping(expression =
            "java(ConverterIdToObject.convertIdToCidade(endereco.getIdCidade()))",
            target = "cidade")
    Endereco toEndereco(EnderecoInput endereco);
}
