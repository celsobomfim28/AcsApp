package br.com.acs.Repositories;

import br.com.acs.Models.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissionalRepository extends JpaRepository<Profissional, Integer> {

    Profissional findByCns(String cns);
}
