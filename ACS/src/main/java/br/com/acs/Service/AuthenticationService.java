package br.com.acs.Service;

import br.com.acs.Models.Profissional;
import br.com.acs.Repositories.ProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private ProfissionalRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Profissional optional = repository.findByCns(username);

        if(optional != null) {

            return optional;
        }

        throw new UsernameNotFoundException("User not found");
    }

}