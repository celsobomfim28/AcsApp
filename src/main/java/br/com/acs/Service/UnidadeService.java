package br.com.acs.Service;

import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import br.com.acs.Repositories.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeService {

    @Autowired
    public static UnidadeRepository unidadeRepository;

    @Autowired
    public UnidadeService(UnidadeRepository unidadeRepository){
        this.unidadeRepository = unidadeRepository;
    }

    public Unidade save(Unidade unidade){
        return unidadeRepository.save(unidade);
    }

    public List<Unidade> index(){
        return unidadeRepository.findAll();
    }

    public Unidade update(Unidade unidade){
        return unidadeRepository.save(unidade);
    }

    public Unidade getById(Integer id){
        return unidadeRepository.findById(id).orElseThrow();
    }
}
