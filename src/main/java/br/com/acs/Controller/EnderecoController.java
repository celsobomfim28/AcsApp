package br.com.acs.Controller;

import br.com.acs.DTO.Input.EnderecoInput;
import br.com.acs.DTO.Mapper.Request.EnderecoRequestMapper;
import br.com.acs.Models.Endereco;
import br.com.acs.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}
