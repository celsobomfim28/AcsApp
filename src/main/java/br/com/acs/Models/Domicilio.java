package br.com.acs.Models;


import br.com.acs.Models.Enum.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDomicilio", nullable = false)
    private Integer idDomicilio;

    @Column(name = "telefoneResidencial")
    private String telefoneResidencial;

    @Column(name = "telefoneReferencial")
    private String telefoneReferencial;

    @NotNull(message = "Situação de moradia é um atributo obrigatório!")
    @Column(name = "situacaoMoradia")
    @Enumerated(EnumType.STRING)
    private SituacaoMoradia situacaoMoradia;

    @NotNull(message = "Localizaçao é um atributo obrigatório!")
    @Column(name = "localizacao")
    @Enumerated(EnumType.STRING)
    private Localizacao localizacao;

    @Column(name = "tipoDomicilio")
    @Enumerated(EnumType.STRING)
    private TipoDomicilio tipoDomicilio;

    @Column(name = "numeroMoradores")
    private int numeroMoradores;

    @Column(name = "numeroComodos")
    private int numeroComodos;

    @Column(name = "AreaProdRural")
    @Enumerated(EnumType.STRING)
    private AreaProdRural areaProdRural;

    @Column(name = "tipoAcessoDomicilio")
    @Enumerated(EnumType.STRING)
    private TipoAcessoDomicilio tipoAcessoDomicilio;

    private boolean energiaEletrica;

    @Enumerated(EnumType.STRING)
    private MaterialConstrucao materialConstrucao;

    @Enumerated(EnumType.STRING)
    private AbastecimentoAgua abastecimentoAgua;

    @Enumerated(EnumType.STRING)
    private FormaEscoamento formaEscoamento;

    @Enumerated(EnumType.STRING)
    private TratamentoAgua tratamentoAgua;

    @Enumerated(EnumType.STRING)
    private DestinoLixo destinoLixo;

    private boolean animal;

    private int qtdAnimal;

}
