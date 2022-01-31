package br.com.acs.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCidade", nullable = false)
    private Integer idCidade;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name="idEstado")
    private Estado estado;
}
