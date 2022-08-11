package br.com.acs.Controller;

import br.com.acs.DTO.Input.EnderecoInput;
import br.com.acs.DTO.Input.EnderecoInput;
import br.com.acs.DTO.Mapper.Request.EnderecoRequestMapper;
import br.com.acs.Models.Endereco;
import br.com.acs.Models.Endereco;
import br.com.acs.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("endereco")
public class EnderecoController {

    @Autowired
    EnderecoService service;

    @Autowired
    EnderecoRequestMapper enderecoRequestMapper;

    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody EnderecoInput enderecoInput){
        Endereco e = service.save(enderecoRequestMapper.toEndereco(enderecoInput));
        return new ResponseEntity<>(e, HttpStatus.OK);
    }
    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Endereco> list = service.index();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody EnderecoInput enderecoInput, @PathVariable Integer id){
        Endereco endereco = service.findById(id);
        if(endereco != null){
            endereco = enderecoRequestMapper.toEndereco(enderecoInput);
            Endereco u = service.update(endereco);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Endereco endereco = service.findById(id);
        return new ResponseEntity<>(endereco, HttpStatus.OK);
    }

}
