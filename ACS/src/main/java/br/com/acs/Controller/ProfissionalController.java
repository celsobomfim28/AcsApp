package br.com.acs.Controller;

import br.com.acs.DTO.Input.EquipeInput;
import br.com.acs.DTO.Input.ProfissionalInput;
import br.com.acs.DTO.Mapper.Request.ProfissionalRequestMapper;
import br.com.acs.DTO.Mapper.Response.ProfissionalResponseMapper;
import br.com.acs.Models.Equipe;
import br.com.acs.Models.Profissional;
import br.com.acs.Service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("profissional")
public class ProfissionalController {

    @Autowired
    ProfissionalService service;

    @Autowired
    ProfissionalRequestMapper profissionalRequestMapper;

    @Autowired
    ProfissionalResponseMapper profissionalResponseMapper;

    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody ProfissionalInput profissionalInput){
        Profissional p = service.save(profissionalRequestMapper.toProfissional(profissionalInput));
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Profissional> list = service.index();
        return new ResponseEntity<>(
                profissionalResponseMapper.toProfissionalOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody ProfissionalInput profissionalInput,
                                    @PathVariable Integer id){
        Profissional profissional = service.findById(id);
        if(profissional != null){
            profissional = profissionalRequestMapper.toProfissional(profissionalInput);
            Profissional u = service.update(profissional);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Profissional profissional = service.findById(id);
        return new ResponseEntity<>(profissionalResponseMapper.toProfissionalOutput(profissional),
                HttpStatus.OK);
    }

}
