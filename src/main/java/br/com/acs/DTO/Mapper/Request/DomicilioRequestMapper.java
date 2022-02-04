package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.DomicilioInput;
import br.com.acs.Models.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterIdToObject.class)
public interface DomicilioRequestMapper {

    @Mapping(expression =
            "java(ConverterIdToObject.convertToSituacaoMoradia(domicilio.getSituacaoMoradia()))",
            target = "situacaoMoradia")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToAreaProdRural(domicilio.getAreaProdRural()))",
            target = "areaProdRural")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToDestinoLixo(domicilio.getDestinoLixo()))",
            target = "destinoLixo")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToAbastecimentoAgua(domicilio.getAbastecimentoAgua()))",
            target = "abastecimentoAgua")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToFormaEscoamento(domicilio.getFormaEscoamento()))",
            target = "formaEscoamento")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToLocalizacao(domicilio.getLocalizacao()))",
            target = "localizacao")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToMaterialConstrucao(domicilio.getMaterialConstrucao()))",
            target = "materialConstrucao")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToTipoAcessoDomicilio(domicilio.getTipoAcessoDomicilio()))",
            target = "tipoAcessoDomicilio")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToTratamentoAgua(domicilio.getTratamentoAgua()))",
            target = "tratamentoAgua")
    @Mapping(expression =
            "java(ConverterIdToObject.convertToTipoDomicilio(domicilio.getTipoDomicilio()))",
            target = "tipoDomicilio")
    Domicilio toDomicilio(DomicilioInput domicilio);
}
