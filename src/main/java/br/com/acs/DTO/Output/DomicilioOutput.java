package br.com.acs.DTO.Output;

import br.com.acs.Models.Enum.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DomicilioOutput {

    private String telefoneResidencial;
    private String telefoneReferencial;
    private String situacaoMoradia;
    private String localizacao;
    private String tipoDomicilio;
    private int numeroMoradores;
    private int numeroComodos;
    private String areaProdRural;
    private String tipoAcessoDomicilio;
    private boolean energiaEletrica;
    private String materialConstrucao;
    private String abastecimentoAgua;
    private String formaEscoamento;
    private String tratamentoAgua;
    private String destinoLixo;
    private boolean animal;
    private int qtdAnimal;
    private List<String> tipoDeAnimal;
    private String endereco;
}
