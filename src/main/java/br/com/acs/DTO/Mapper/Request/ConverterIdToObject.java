package br.com.acs.DTO.Mapper.Request;

import br.com.acs.Models.*;
import br.com.acs.Models.Enum.*;
import br.com.acs.Service.*;
import br.com.acs.Utils.Util;

import java.time.LocalDate;
import java.time.Period;

public class ConverterIdToObject {

    public static Unidade convertToUnidade(Integer id){
        return UnidadeService.unidadeRepository.getById(id);
    }

    public static Equipe convertToEquipe(Integer id){
        return EquipeService.equipeRepository.getById(id);
    }

    public static Crianca convertToCrianca(Integer id){
        return CriancaService.criancaRepository.getById(id);
    }

    public static Profissional convertToProfissional(Integer id){
        return ProfissionalService.profissionalRepository.getById(id);
    }
    public static int convertToIdade(int id, String dataFim){
        Crianca c = CriancaService.criancaRepository.getById(id);
        Period idade = Period.between(c.getDataNascimento(),
                Util.toLocalDate(dataFim));
        int i = (idade.getYears()*12)+ idade.getMonths();
        return i;
    }

    public static double setPeso(double peso){
        return peso;
    }
    public static Endereco convertToEndereco(Integer id){
        return EnderecoService.enderecoRepository.getById(id);
    }
    public static TipoLogradouro convertToTipoLogradouro(String tipo){
        for(TipoLogradouro tipoLog : TipoLogradouro.values()){
            if(tipo.equalsIgnoreCase(tipoLog.name())){
                return tipoLog;
            }
        }
        return null;
    }

    public static TipoParto convertToTipoParto(String tipo){
        for(TipoParto tipoParto : TipoParto.values()){
            if(tipo.equalsIgnoreCase(tipoParto.name())){
                return tipoParto;
            }
        }
        return null;
    }

    public static Raca convertToRaca(String raca){
        for(Raca r : Raca.values()){
            if(raca.equalsIgnoreCase(r.name())){
                return r;
            }
        }
        return null;
    }

    public static TipoVacina convertToTipoVacina(String tipo){
        for(TipoVacina t : TipoVacina.values()){
            if(tipo.equalsIgnoreCase(t.name())){
                return t;
            }
        }
        return null;
    }

    public static Dose convertToDose(String dose){
        for(Dose d : Dose.values()){
            if(dose.equalsIgnoreCase(d.name())){
                return d;
            }
        }
        return null;
    }

    public static Cidade convertIdToCidade(Integer id){
        return CidadeService.cidadeRepository.getById(id);
    }

    public static LocalDate convertToLocalDate(String date){
        return Util.toLocalDate(date);
    }

}
