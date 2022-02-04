package br.com.acs.DTO.Mapper.Response;

import br.com.acs.DTO.Output.DomicilioOutput;
import br.com.acs.Models.Domicilio;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        imports = ConvertResponse.class)
public interface DomicilioResponseMapper {

    @Mapping(expression = "java(domicilio.getSituacaoMoradia().name())", target = "situacaoMoradia")
    @Mapping(expression = "java(domicilio.getTipoDomicilio().name())", target = "tipoDomicilio")
    @Mapping(expression = "java(domicilio.getAbastecimentoAgua().name())", target = "abastecimentoAgua")
    @Mapping(expression = "java(domicilio.getAreaProdRural().name())", target = "areaProdRural")
    @Mapping(expression = "java(domicilio.getDestinoLixo().name())", target = "destinoLixo")
    @Mapping(expression = "java(domicilio.getFormaEscoamento().name())", target = "formaEscoamento")
    @Mapping(expression = "java(domicilio.getMaterialConstrucao().name())", target = "materialConstrucao")
    @Mapping(expression = "java(domicilio.getLocalizacao().name())", target = "localizacao")
    @Mapping(expression = "java(domicilio.getTipoAcessoDomicilio().name())", target = "tipoAcessoDomicilio")
    @Mapping(expression =
            "java(ConvertResponse.convertTipoAnimalToStr(domicilio.getIdDomicilio()))", target = "tipoDeAnimal")
    @Mapping(expression =
            "java(ConvertResponse.convertEnderecoToStr(domicilio.getIdDomicilio()))", target = "endereco")
    DomicilioOutput toDomicilioOutput(Domicilio domicilio);

    @Mapping(expression = "java(domicilio.getSituacaoMoradia().name())", target = "situacaoMoradia")
    @Mapping(expression = "java(domicilio.getTipoDomicilio().name())", target = "tipoDomicilio")
    @Mapping(expression = "java(domicilio.getAbastecimentoAgua().name())", target = "abastecimentoAgua")
    @Mapping(expression = "java(domicilio.getAreaProdRural().name())", target = "areaProdRural")
    @Mapping(expression = "java(domicilio.getDestinoLixo().name())", target = "destinoLixo")
    @Mapping(expression = "java(domicilio.getFormaEscoamento().name())", target = "formaEscoamento")
    @Mapping(expression = "java(domicilio.getMaterialConstrucao().name())", target = "materialConstrucao")
    @Mapping(expression = "java(domicilio.getLocalizacao().name())", target = "localizacao")
    @Mapping(expression = "java(domicilio.getTipoAcessoDomicilio().name())", target = "tipoAcessoDomicilio")
    @Mapping(expression =
            "java(ConvertResponse.convertTipoAnimalToStr(domicilio.getIdDomicilio()))", target = "tipoDeAnimal")
    @Mapping(expression =
            "java(ConvertResponse.convertEnderecoToStr(domicilio.getIdDomicilio()))", target = "endereco")
    List<DomicilioOutput> toDomicilioOutputList(List<Domicilio> domicilios);

}
