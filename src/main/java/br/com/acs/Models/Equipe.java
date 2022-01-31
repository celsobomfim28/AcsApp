package br.com.acs.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe", nullable = false)
    private Integer idEquipe;

    @Column(name = "ine", nullable = false)
    private String ine;

    @Column(name = "numero", nullable = false)
    private int numero;

    @ManyToOne
    @JoinColumn(name = "idUnidade")
    private Unidade unidade;
}
