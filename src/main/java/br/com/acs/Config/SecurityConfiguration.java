package br.com.acs.Config;

import br.com.acs.Repositories.ProfissionalRepository;
import br.com.acs.Service.AuthenticationService;
import br.com.acs.Service.TokenService;
import br.com.acs.errors.CustomAccessDeniedHandler;
import br.com.acs.errors.CustomAuthenticationFailureHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;

import javax.servlet.http.HttpServletResponse;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ProfissionalRepository repository;

    @Override
    @Bean
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    //Configurations for authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authenticationService).passwordEncoder(new BCryptPasswordEncoder());
    }

    //Configuration for authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/error").permitAll()
                .antMatchers(HttpMethod.POST, "/auth").permitAll()

                .antMatchers(HttpMethod.POST, "/unidade/save").permitAll()
                .antMatchers(HttpMethod.GET, "/unidade/index").permitAll()
                .antMatchers(HttpMethod.PATCH, "/unidade/update/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/unidade/{id}").permitAll()

                .antMatchers(HttpMethod.POST, "/equipe/save").permitAll()
                .antMatchers(HttpMethod.GET, "/equipe/index").permitAll()
                .antMatchers(HttpMethod.PATCH, "/equipe/update/{id}").permitAll()
                .antMatchers(HttpMethod.GET, "/equipe/{id}").permitAll()

                .antMatchers(HttpMethod.POST, "/profissional/save").permitAll()
                .antMatchers(HttpMethod.GET, "/profissional/index").permitAll()

                .antMatchers(HttpMethod.GET, "/estado/index").permitAll()
                .antMatchers(HttpMethod.GET, "/cidade/index").permitAll()

                .antMatchers(HttpMethod.POST, "/crianca/save").permitAll()

                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .failureHandler(authenticationFailureHandler())
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler())
                .defaultAuthenticationEntryPointFor(
                        new Http403ForbiddenEntryPoint(),
                        new RequestHeaderRequestMatcher("X-Requested-With", "XMLHttpRequest"))
                .and()
                .csrf()
                .disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().addFilterBefore(new TokenAuthenticationFilter(tokenService, repository), UsernamePasswordAuthenticationFilter.class);


    }
    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new CustomAccessDeniedHandler();
    }

}