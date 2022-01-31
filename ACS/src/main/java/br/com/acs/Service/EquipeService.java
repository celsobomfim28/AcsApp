package br.com.acs.Service;

import br.com.acs.Models.Equipe;
import br.com.acs.Repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    public static EquipeRepository equipeRepository;

    @Autowired
    public EquipeService(EquipeRepository equipeRepository){
        this.equipeRepository = equipeRepository;
    }

    public Equipe save(Equipe equipe){
        return equipeRepository.save(equipe);
    }

    public List<Equipe> index(){
        return equipeRepository.findAll();
    }

    public Equipe findById(Integer id){
        return equipeRepository.findById(id).orElseThrow();
    }
    public Equipe update(Equipe equipe){
        return equipeRepository.save(equipe);
    }
}
