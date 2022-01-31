package br.com.acs.Controller;

import br.com.acs.Models.Cidade;
import br.com.acs.Service.CidadeService;
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
@RequestMapping("cidade")
public class CidadeController {

    @Autowired
    CidadeService service;

    @RequestMapping(method= RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Cidade> list = service.index();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Cidade cidade = service.findById(id);
        return new ResponseEntity<>(cidade, HttpStatus.OK);
    }
}
