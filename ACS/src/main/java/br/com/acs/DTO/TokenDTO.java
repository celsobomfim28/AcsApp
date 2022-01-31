package br.com.acs.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TokenDTO {

    private Integer idCliente;
    private String type;
    private String token;

}