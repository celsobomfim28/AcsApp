package br.com.acs.Service;

import br.com.acs.Models.Cidade;
import br.com.acs.Repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    
    @Autowired
    public static CidadeRepository cidadeRepository;

    @Autowired
    public CidadeService(CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    public List<Cidade> index(){
        return cidadeRepository.findAll();
    }

    public Cidade findById(Integer id){
        return cidadeRepository.findById(id).orElseThrow();
    }
    public Cidade update(Cidade cidade){
        return cidadeRepository.save(cidade);
    }
}
