package br.com.acs.Repositories;

import br.com.acs.Models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}
