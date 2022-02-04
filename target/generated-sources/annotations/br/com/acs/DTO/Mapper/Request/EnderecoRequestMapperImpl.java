package br.com.acs.DTO.Mapper.Request;

import br.com.acs.DTO.Input.EnderecoInput;
import br.com.acs.Models.Endereco;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-04T13:29:00-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class EnderecoRequestMapperImpl implements EnderecoRequestMapper {

    @Override
    public Endereco toEndereco(EnderecoInput endereco) {
        if ( endereco == null ) {
            return null;
        }

        Endereco endereco1 = new Endereco();

        endereco1.setNomeLogradouro( endereco.getNomeLogradouro() );
        endereco1.setNumero( endereco.getNumero() );
        endereco1.setComplemento( endereco.getComplemento() );
        endereco1.setBairro( endereco.getBairro() );
        endereco1.setCep( endereco.getCep() );

        endereco1.setTipoLogradouro( ConverterIdToObject.convertToTipoLogradouro(endereco.getTipoLogradouro()) );
        endereco1.setDomicilio( ConverterIdToObject.convertIdToDomicilio(endereco.getIdDomicilio()) );
        endereco1.setCidade( ConverterIdToObject.convertIdToCidade(endereco.getIdCidade()) );

        return endereco1;
    }
}
