package br.com.acs.DTO.Input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VacinaInput {

    private String dose;
    private String tipoVacina;
    private String lote;
    private String dataAplicacao;
    private int crianca;
}
