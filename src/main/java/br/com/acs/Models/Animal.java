package br.com.acs.Models;

import br.com.acs.Models.Enum.TipoAnimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAnimal", nullable = false)
    private Integer idAnimal;

    @Enumerated(EnumType.STRING)
    private TipoAnimal tipoAnimal;

    @ManyToOne
    @JoinColumn(name = "idDomicilio")
    private Domicilio domicilio;
}
