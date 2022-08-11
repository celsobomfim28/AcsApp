package br.com.acs.DTO.Input;

import br.com.acs.Utils.Util;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
public class PesoInput {

    private String dataPeso;
    private int idadeEmMeses;
    private int crianca;
    private double peso;

}
