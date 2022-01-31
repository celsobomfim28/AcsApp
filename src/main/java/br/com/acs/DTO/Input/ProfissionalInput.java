package br.com.acs.DTO.Input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProfissionalInput {

    private String cns;
    private String nome;
    private int microarea;
    private String password;
    private int idEquipe;

}
