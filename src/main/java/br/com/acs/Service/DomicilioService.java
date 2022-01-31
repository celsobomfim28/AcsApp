package br.com.acs.Service;

import br.com.acs.Models.Domicilio;
import br.com.acs.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService {

    @Autowired
    public static DomicilioRepository domicilioRepository;

    @Autowired
    public DomicilioService(DomicilioRepository domicilioRepository){
        this.domicilioRepository = domicilioRepository;
    }

    public Domicilio save(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }

    public List<Domicilio> index(){
        return domicilioRepository.findAll();
    }

    public Domicilio findById(Integer id){
        return domicilioRepository.findById(id).orElseThrow();
    }
    public Domicilio update(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }
}
