package br.com.acs.Controller;

import br.com.acs.DTO.Input.AnimalInput;
import br.com.acs.DTO.Mapper.Request.AnimalRequestMapper;
import br.com.acs.Models.Animal;
import br.com.acs.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("animal")
public class AnimalController {

    @Autowired
    AnimalService service;

    @Autowired
    AnimalRequestMapper animalRequestMapper;

    @RequestMapping(method= RequestMethod.POST, path="save")
    public ResponseEntity<?> save(@RequestBody AnimalInput animalInput){
        return new ResponseEntity<>(service.save(
                animalRequestMapper.toAnimal(animalInput)), HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path = "index")
    public ResponseEntity<?> index(){
        List<Animal> list = service.index();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "domicilio/{id}")
    public ResponseEntity<?> getAnimalDomicilio(@PathVariable Integer id){
        List<Animal> list = service.findByIdDomicilio(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
