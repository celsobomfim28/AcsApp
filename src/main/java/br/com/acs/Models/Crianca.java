package br.com.acs.Models;

import br.com.acs.Models.Enum.Raca;
import br.com.acs.Models.Enum.TipoParto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Crianca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idCrianca;

    private String nome;

    private String sus;

    @Enumerated(EnumType.STRING)
    private TipoParto tipoParto;

    private LocalDate dataNascimento;

    private String localNascimento;

    private String nomeMae;

    private String nomePai;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idEndereco", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Endereco endereco;

    private String telefone;

    private double pesoAoNascer;

    private double perimetroCefalico;

    private double comprimentoAoNascer;

    private double apgar;

    @Enumerated(EnumType.STRING)
    private Raca raca;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idProfissional", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore
    private Profissional profissional;

}
