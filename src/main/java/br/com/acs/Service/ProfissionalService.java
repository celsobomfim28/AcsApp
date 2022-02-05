package br.com.acs.Service;

import br.com.acs.Models.Profissional;
import br.com.acs.Repositories.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfissionalService {

    @Autowired
    public static ProfissionalRepository profissionalRepository;

    @Autowired
    public ProfissionalService (ProfissionalRepository profissionalRepository){
        this.profissionalRepository = profissionalRepository;
    }

    public Profissional save(Profissional profissional){
        return profissionalRepository.save(profissional);
    }

    public List<Profissional> index(){
        return profissionalRepository.findAll();
    }

    public Profissional findById(Integer id){
        return profissionalRepository.findById(id).orElseThrow();
    }

    public Profissional update(Profissional profissional){
        return profissionalRepository.save(profissional);
    }

    public Profissional findByCns(String cns){
        return profissionalRepository.findByCns(cns);
    }
}
