package br.com.acs.Repositories;

import br.com.acs.Models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    @Query("SELECT e from Endereco e WHERE e.domicilio.idDomicilio = ?1")
    Endereco findEnderecoByIdDomicilio(Integer id);
}
