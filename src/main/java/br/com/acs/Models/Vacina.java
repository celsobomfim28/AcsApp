package br.com.acs.Models;

import br.com.acs.Models.Enum.Dose;
import br.com.acs.Models.Enum.TipoVacina;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Vacina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idVacina;

    @Enumerated(EnumType.STRING)
    private Dose dose;

    @Enumerated(EnumType.STRING)
    private TipoVacina tipoVacina;

    private String lote;

    private LocalDate dataAplicacao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCrianca")
    private Crianca crianca;
}
