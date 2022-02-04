package br.com.acs.Service;

import br.com.acs.Models.Endereco;
import br.com.acs.Repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    public static EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco save(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> index(){
        return enderecoRepository.findAll();
    }

    public Endereco findById(Integer id){
        return enderecoRepository.findById(id).orElseThrow();
    }
    public Endereco update(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    public Endereco findByIdDomicilio(Integer id){
        return enderecoRepository.findEnderecoByIdDomicilio(id);
    }
}
