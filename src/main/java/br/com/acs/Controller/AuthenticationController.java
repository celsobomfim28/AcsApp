package br.com.acs.Controller;

import br.com.acs.DTO.LoginDTO;
import br.com.acs.DTO.TokenDTO;
import br.com.acs.Models.Profissional;
import br.com.acs.Service.ProfissionalService;
import br.com.acs.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;



    @PostMapping
    public ResponseEntity<TokenDTO> auth(@RequestBody @Validated LoginDTO loginDTO){
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(loginDTO.getUser(), loginDTO.getPass());

            Authentication authentication =
                    authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            Profissional c = ProfissionalService.profissionalRepository.findByCns(loginDTO.getUser());
            String token = tokenService.generateToken(authentication);

            return ResponseEntity.ok(TokenDTO.builder()
                    .type("Bearer")
                    .token(token)
                    .idCliente(c.getIdProfissional())
                    .build());

    }

}