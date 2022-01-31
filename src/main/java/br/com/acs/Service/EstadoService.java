package br.com.acs.Service;

import br.com.acs.Models.Estado;
import br.com.acs.Repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    
    @Autowired
    public static EstadoRepository estadoRepository;
    
    @Autowired
    public EstadoService(EstadoRepository estadoRepository){
        this.estadoRepository = estadoRepository;
    };

    public List<Estado> index(){
        return estadoRepository.findAll();
    }

    public Estado findById(Integer id){
        return estadoRepository.findById(id).orElseThrow();
    }
    public Estado update(Estado estado){
        return estadoRepository.save(estado);
    }
}
