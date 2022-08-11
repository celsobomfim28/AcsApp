package br.com.acs.Repositories;

import br.com.acs.Models.Crianca;
import br.com.acs.Models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CriancaRepository extends JpaRepository<Crianca, Integer> {

    @Query("SELECT c from Crianca c WHERE c.endereco.idEndereco = ?1")
    Crianca findEnderecoById(Integer id);
}
