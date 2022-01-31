package br.com.acs.DTO.Mapper.Request;

import br.com.acs.Models.Equipe;
import br.com.acs.Models.Unidade;
import br.com.acs.Service.EquipeService;
import br.com.acs.Service.UnidadeService;

public class ConverterIdToObject {

    public static Unidade convertToUnidade(Integer id){
        return UnidadeService.unidadeRepository.getById(id);
    }

    public static Equipe convertToEquipe(Integer id){
        return EquipeService.equipeRepository.getById(id);
    }
}
