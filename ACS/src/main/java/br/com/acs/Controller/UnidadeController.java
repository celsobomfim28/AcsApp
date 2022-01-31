package br.com.acs.Controller;

import br.com.acs.DTO.Mapper.Request.UnidadeRequestMapper;
import br.com.acs.DTO.Mapper.Response.UnidadeResponseMapper;
import br.com.acs.DTO.Output.UnidadeOutput;
import br.com.acs.Models.Unidade;
import br.com.acs.Service.UnidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("unidade")
public class UnidadeController {

    @Autowired
    UnidadeService service;

    @Autowired
    UnidadeResponseMapper unidadeResponseMapper;

    @Autowired
    UnidadeRequestMapper unidadeRequestMapper;

    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody UnidadeOutput unidadeOutput){
        Unidade u = service.save(unidadeRequestMapper.toUnidade(unidadeOutput));
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Unidade> list = service.index();
        return new ResponseEntity<>(unidadeResponseMapper.toUnidadeOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody UnidadeOutput unidadeOutput, @PathVariable Integer id){
        Unidade unidade = service.getById(id);
        if(unidade != null){
            unidade = unidadeRequestMapper.toUnidade(unidadeOutput);
            Unidade u = service.update(unidade);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Unidade unidade = service.getById(id);
        return new ResponseEntity<>(unidadeResponseMapper.toUnidadeOutput(unidade), HttpStatus.OK);
    }
}
