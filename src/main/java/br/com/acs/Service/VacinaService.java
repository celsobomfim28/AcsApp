package br.com.acs.Service;

import br.com.acs.Models.Vacina;
import br.com.acs.Repositories.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaService {

    @Autowired
    public static VacinaRepository vacinaRepository;

    @Autowired
    public VacinaService(VacinaRepository vacinaRepository){
        this.vacinaRepository = vacinaRepository;
    }

    public List<Vacina> index(){
        return vacinaRepository.findAll();
    }
    public Vacina save(Vacina vacina){return vacinaRepository.save(vacina);}
    public Vacina findById(Integer id){
        return vacinaRepository.findById(id).orElseThrow();
    }
    public Vacina update(Vacina Vacina){
        return vacinaRepository.save(Vacina);
    }
}
