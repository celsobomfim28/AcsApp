package br.com.acs.Service;

import br.com.acs.Models.Animal;
import br.com.acs.Repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    
    @Autowired
    public static AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    public List<Animal> index(){
        return animalRepository.findAll();
    }

    public Animal findById(Integer id){
        return animalRepository.findById(id).orElseThrow();
    }
    public Animal update(Animal animal){
        return animalRepository.save(animal);
    }
    public List<Animal> findByIdDomicilio(Integer id){
        return animalRepository.findAnimalByIdDomicilio(id);
    }
}
