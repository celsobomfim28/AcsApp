package br.com.acs.Service;

import br.com.acs.Models.Crianca;
import br.com.acs.Repositories.CriancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriancaService {

    @Autowired(required = false)
    public static CriancaRepository criancaRepository;
    
    @Autowired
    public CriancaService(CriancaRepository criancaRepository){
        this.criancaRepository = criancaRepository;
    }
    
    public List<Crianca> index(){
        return criancaRepository.findAll();
    }
    public Crianca save(Crianca crianca){
        return criancaRepository.save(crianca);
    }
    public Crianca findById(Integer id){
        return criancaRepository.findById(id).orElseThrow();
    }
    public Crianca update(Crianca Crianca){
        return criancaRepository.save(Crianca);
    }
}
