package br.com.acs.DTO.Mapper.Response;

import br.com.acs.Models.Crianca;
import br.com.acs.Models.Endereco;
import br.com.acs.Service.CriancaService;
import br.com.acs.Service.EnderecoService;
import br.com.acs.Utils.Util;

import java.time.LocalDate;

public class ConvertResponse {



   public static String convertEnderecoToStr(Integer id){
      Crianca c = CriancaService.criancaRepository.findEnderecoById(id);
      Endereco e = c.getEndereco();
        String endereco = e.getTipoLogradouro().name() +e.getNomeLogradouro() +e.getNumero()
                +e.getBairro() +e.getCidade().getNome() + e.getCidade().getEstado().getUf();
        return endereco;
    }

    public static String convertLocalDateToStr(LocalDate localDate){
       return Util.toString(localDate);
    }
}
