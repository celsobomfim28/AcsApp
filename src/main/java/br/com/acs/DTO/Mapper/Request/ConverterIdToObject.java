package br.com.acs.DTO.Mapper.Request;

import br.com.acs.Models.Cidade;
import br.com.acs.Models.Domicilio;
import br.com.acs.Models.Enum.*;
import br.com.acs.Models.Equipe;
import br.com.acs.Models.Unidade;
import br.com.acs.Service.CidadeService;
import br.com.acs.Service.DomicilioService;
import br.com.acs.Service.EquipeService;
import br.com.acs.Service.UnidadeService;

public class ConverterIdToObject {

    public static Unidade convertToUnidade(Integer id){
        return UnidadeService.unidadeRepository.getById(id);
    }

    public static Equipe convertToEquipe(Integer id){
        return EquipeService.equipeRepository.getById(id);
    }

    public static Domicilio convertIdToDomicilio(Integer id){
        return DomicilioService.domicilioRepository.getById(id);
    }

    public static TipoAnimal convertStrToEnum(String tipo){
        for(TipoAnimal tipoAnimal : TipoAnimal.values()){
            if(tipo.equalsIgnoreCase(tipoAnimal.name())){
                return tipoAnimal;
            }
        }
        return null;
    }

    public static TipoLogradouro convertToTipoLogradouro(String tipo){
        for(TipoLogradouro tipoLog : TipoLogradouro.values()){
            if(tipo.equalsIgnoreCase(tipoLog.name())){
                return tipoLog;
            }
        }
        return null;
    }

    public static Cidade convertIdToCidade(Integer id){
        return CidadeService.cidadeRepository.getById(id);
    }

    public static SituacaoMoradia convertToSituacaoMoradia(String tipo){
        for(SituacaoMoradia situacaoMoradia : SituacaoMoradia.values()){
            if(tipo.equalsIgnoreCase(situacaoMoradia.name())){
                return situacaoMoradia;
            }
        }
        return null;
    }
    public static Localizacao convertToLocalizacao(String tipo){
        for(Localizacao localizacao : Localizacao.values()){
            if(tipo.equalsIgnoreCase(localizacao.name())){
                return localizacao;
            }
        }
        return null;
    }
    public static TipoDomicilio convertToTipoDomicilio(String tipo){
        for(TipoDomicilio tipoDomicilio : TipoDomicilio.values()){
            if(tipo.equalsIgnoreCase(tipoDomicilio.name())){
                return tipoDomicilio;
            }
        }
        return null;
    }
    public static AreaProdRural convertToAreaProdRural(String tipo){
        for(AreaProdRural areaProdRural : AreaProdRural.values()){
            if(tipo.equalsIgnoreCase(areaProdRural.name())){
                return areaProdRural;
            }
        }
        return null;
    }
    public static TipoAcessoDomicilio convertToTipoAcessoDomicilio(String tipo){
        for(TipoAcessoDomicilio tipoAcessoDomicilio : TipoAcessoDomicilio.values()){
            if(tipo.equalsIgnoreCase(tipoAcessoDomicilio.name())){
                return tipoAcessoDomicilio;
            }
        }
        return null;
    }
    public static MaterialConstrucao convertToMaterialConstrucao(String tipo){
        for(MaterialConstrucao materialConstrucao : MaterialConstrucao.values()){
            if(tipo.equalsIgnoreCase(materialConstrucao.name())){
                return materialConstrucao;
            }
        }
        return null;
    }
    public static AbastecimentoAgua convertToAbastecimentoAgua(String tipo){
        for(AbastecimentoAgua abastecimentoAgua : AbastecimentoAgua.values()){
            if(tipo.equalsIgnoreCase(abastecimentoAgua.name())){
                return abastecimentoAgua;
            }
        }
        return null;
    }
    public static FormaEscoamento convertToFormaEscoamento(String tipo){
        for(FormaEscoamento formaEscoamento : FormaEscoamento.values()){
            if(tipo.equalsIgnoreCase(formaEscoamento.name())){
                return formaEscoamento;
            }
        }
        return null;
    }

    public static TratamentoAgua convertToTratamentoAgua(String tipo){
        for(TratamentoAgua tratamentoAgua : TratamentoAgua.values()){
            if(tipo.equalsIgnoreCase(tratamentoAgua.name())){
                return tratamentoAgua;
            }
        }
        return null;
    }

    public static DestinoLixo convertToDestinoLixo(String tipo){
        for(DestinoLixo destinoLixo : DestinoLixo.values()){
            if(tipo.equalsIgnoreCase(destinoLixo.name())){
                return destinoLixo;
            }
        }
        return null;
    }
}
