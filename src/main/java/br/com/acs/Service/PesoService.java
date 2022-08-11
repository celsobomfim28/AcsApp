package br.com.acs.Service;

import br.com.acs.Models.Peso;
import br.com.acs.Repositories.PesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesoService {

    @Autowired(required = false)
    public static PesoRepository pesoRepository;

    @Autowired
    public PesoService(PesoRepository pesoRepository){
        this.pesoRepository = pesoRepository;
    }

    public Peso save(Peso peso){
        return pesoRepository.save(peso);
    }
    public List<Peso> index(){
        return pesoRepository.findAll();
    }

    public Peso findById(Integer id){
        return pesoRepository.findById(id).orElseThrow();
    }
    public Peso update(Peso Peso){
        return pesoRepository.save(Peso);
    }
}
