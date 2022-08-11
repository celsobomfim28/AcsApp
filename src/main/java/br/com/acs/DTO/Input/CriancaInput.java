package br.com.acs.DTO.Input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CriancaInput {

    private String nome;
    private String sus;
    private String tipoParto;
    private String dataNascimento;
    private String localNascimento;
    private String nomeMae;
    private String nomePai;
    private int idEndereco;
    private String telefone;
    private double pesoAoNascer;
    private double perimetroCefalico;
    private double comprimentoAoNascer;
    private double apgar;
    private String raca;
    private int profissional;
}
