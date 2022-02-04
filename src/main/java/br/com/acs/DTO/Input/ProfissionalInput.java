package br.com.acs.DTO.Input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Getter
@Setter
@NoArgsConstructor
public class ProfissionalInput {

    private String cns;
    private String nome;
    private int microarea;
    private String password;
    private int idEquipe;

    public void setPassword(String password){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String p = bCryptPasswordEncoder.encode(password);
        this.password = p;
    }




}
