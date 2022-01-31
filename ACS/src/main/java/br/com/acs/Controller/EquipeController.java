package br.com.acs.Controller;

import br.com.acs.DTO.Input.EquipeInput;
import br.com.acs.DTO.Mapper.Request.EquipeRequestMapper;
import br.com.acs.DTO.Mapper.Response.EquipeResponseMapper;
import br.com.acs.Models.Equipe;
import br.com.acs.Service.EquipeService;
import br.com.acs.Service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("equipe")
public class EquipeController {
    
    @Autowired
    EquipeService service;
    
    @Autowired
    EquipeRequestMapper equipeRequestMapper;
    
    @Autowired
    EquipeResponseMapper equipeResponseMapper;

    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody EquipeInput equipeInput){
        Equipe e = service.save(equipeRequestMapper.toEquipe(equipeInput));
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Equipe> list = service.index();
        return new ResponseEntity<>(equipeResponseMapper.toEquipeOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody EquipeInput equipeInput, @PathVariable Integer id){
        Equipe equipe = service.findById(id);
        if(equipe != null){
            equipe = equipeRequestMapper.toEquipe(equipeInput);
            Equipe u = service.update(equipe);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Equipe equipe = service.findById(id);
        return new ResponseEntity<>(equipeResponseMapper.toEquipeOutput(equipe), HttpStatus.OK);
    }
}
