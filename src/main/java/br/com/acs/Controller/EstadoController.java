package br.com.acs.Controller;

import br.com.acs.Models.Equipe;
import br.com.acs.Models.Estado;
import br.com.acs.Service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("estado")
public class EstadoController {

    @Autowired
    EstadoService service;

    @RequestMapping(method= RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Estado> list = service.index();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Estado estado = service.findById(id);
        return new ResponseEntity<>(estado, HttpStatus.OK);
    }
}
