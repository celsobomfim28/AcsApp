package br.com.acs.Repositories;

import br.com.acs.Models.Animal;
import br.com.acs.Models.Enum.TipoAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a from Animal a where a.domicilio.idDomicilio = ?1")
    List<Animal> findAnimalByIdDomicilio(Integer id);

}
