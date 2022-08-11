package br.com.acs.Repositories;

import br.com.acs.Models.Peso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesoRepository extends JpaRepository<Peso, Integer> {
}
