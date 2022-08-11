package br.com.acs.Controller;

import br.com.acs.DTO.Input.VacinaInput;
import br.com.acs.DTO.Mapper.Request.VacinaRequestMapper;
import br.com.acs.DTO.Mapper.Response.VacinaResponseMapper;
import br.com.acs.Models.Vacina;
import br.com.acs.Service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("vacina")
public class VacinaController {
    @Autowired
    VacinaService vacinaService;

    @Autowired
    VacinaRequestMapper vacinaRequestMapper;

    @Autowired
    VacinaResponseMapper vacinaResponseMapper;


    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody VacinaInput vacinaInput){
        Vacina c = vacinaService.save(vacinaRequestMapper.toVacina(vacinaInput));
        return  new ResponseEntity<>(c, HttpStatus.OK);
    }
    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Vacina> list = vacinaService.index();

        return new ResponseEntity<>(
                vacinaResponseMapper.toVacinaOutputList(list), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "update/{id}")
    public ResponseEntity<?> update(@RequestBody VacinaInput vacinaInput,
                                    @PathVariable Integer id){
        Vacina vacina = vacinaService.findById(id);
        if(vacina != null){
            vacina = vacinaRequestMapper.toVacina(vacinaInput);
            Vacina u = vacinaService.update(vacina);
            return new ResponseEntity<>(u, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
