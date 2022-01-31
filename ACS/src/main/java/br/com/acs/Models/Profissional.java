package br.com.acs.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Profissional implements UserDetails, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfissional", nullable = false)
    private Integer idProfissional;

    @Column(name = "cns", nullable = false)
    private String cns;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "microarea", nullable = false)
    private int microarea;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "senhaResetToken", length = 45)
    private String senhaResetToken;

    @Column(name = "senhaResetExpire", length = 45)
    private String senhaResetExpire;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Perfil> perfis;

    @ManyToOne
    @JoinColumn(name = "idEquipe")
    private Equipe equipe;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.perfis;
    }

    @Override
    public String getPassword() {
        return this.getPassword();
    }

    @Override
    public String getUsername() {
        return this.getCns();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
