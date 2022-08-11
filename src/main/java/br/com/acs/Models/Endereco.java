package br.com.acs.Models;

import br.com.acs.Models.Enum.TipoLogradouro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idEndereco;

    @Enumerated(EnumType.STRING)
    private TipoLogradouro tipoLogradouro;

    @Column(nullable = false)
    private String nomeLogradouro;

    @Column(nullable = false)
    private int numero;

    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cep;

    @OneToOne
    @JoinColumn(name="idCidade")
    private Cidade cidade;
}
