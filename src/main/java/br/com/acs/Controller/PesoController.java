package br.com.acs.Controller;

import br.com.acs.DTO.Input.PesoInput;
import br.com.acs.DTO.Mapper.Request.PesoRequestMapper;
import br.com.acs.DTO.Mapper.Response.PesoResponseMapper;
import br.com.acs.Models.Crianca;
import br.com.acs.Models.Peso;
import br.com.acs.Service.CriancaService;
import br.com.acs.Service.PesoService;
import br.com.acs.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.List;

@Controller
@RestController
@RequestMapping("peso")
public class PesoController {

    @Autowired
    PesoService pesoService;

    @Autowired
    PesoRequestMapper pesoRequestMapper;

    @Autowired
    PesoResponseMapper pesoResponseMapper;


    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody PesoInput pesoInput){
        Peso c = pesoService.save(pesoRequestMapper.toPeso(pesoInput));
        return  new ResponseEntity<>(c, HttpStatus.OK);
    }
    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Peso> list = pesoService.index();

        return new ResponseEntity<>(
                pesoResponseMapper.toPesoOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody PesoInput pesoInput,
                                    @PathVariable Integer id){
        Peso peso = pesoService.findById(id);
        if(peso != null){
            peso = pesoRequestMapper.toPeso(pesoInput);
            Peso u = pesoService.update(peso);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
