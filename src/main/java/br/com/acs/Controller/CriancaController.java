package br.com.acs.Controller;

import br.com.acs.DTO.Input.CriancaInput;
import br.com.acs.DTO.Mapper.Request.CriancaRequestMapper;
import br.com.acs.DTO.Mapper.Response.CriancaResponseMapper;
import br.com.acs.Models.Crianca;
import br.com.acs.Service.CriancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("crianca")
public class CriancaController {

    @Autowired
    CriancaService criancaService;

    @Autowired
    CriancaRequestMapper criancaRequestMapper;

    @Autowired
    CriancaResponseMapper criancaResponseMapper;


    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody CriancaInput criancaInput){
        Crianca c = criancaService.save(criancaRequestMapper.toCrianca(criancaInput));
        return new ResponseEntity<>(c, HttpStatus.OK);

    }
    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Crianca> list = criancaService.index();

        return new ResponseEntity<>(
               criancaResponseMapper.toCriancaOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody CriancaInput criancaInput,
                                    @PathVariable Integer id){
        Crianca crianca = criancaService.findById(id);
        if(crianca != null){
            crianca = criancaRequestMapper.toCrianca(criancaInput);
            Crianca u = criancaService.update(crianca);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Crianca crianca = criancaService.findById(id);
        return new ResponseEntity<>(criancaResponseMapper.toCriancaOutput(crianca),
                HttpStatus.OK);
    }
}
