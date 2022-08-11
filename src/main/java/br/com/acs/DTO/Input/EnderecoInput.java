package br.com.acs.DTO.Input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EnderecoInput {

    private String tipoLogradouro;
    private String nomeLogradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private int idCidade;
}
