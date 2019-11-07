package com.eml.energy.controller.springsecurityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    /*TODO: https://www.baeldung.com/spring-security-login*/
    /*Refer this link and do login*/
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                /*.antMatchers(HttpMethod.GET, "/tenders/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/tenders/**").hasRole("USER")
                .antMatchers(HttpMethod.DELETE, "/tenders/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/canTen/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/canTen/**").hasRole("USER")
                .antMatchers(HttpMethod.DELETE, "/canTen/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/transaction/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/transaction/**").hasRole("USER")
                .antMatchers(HttpMethod.DELETE, "/transaction/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/reqtend/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/reqtend/**").hasRole("USER")
                .antMatchers(HttpMethod.DELETE, "/reqtend/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/reqtrans/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/reqtrans/**").hasRole("USER")
                .antMatchers(HttpMethod.DELETE, "/reqtrans/**").hasRole("USER")*/
                .antMatchers(HttpMethod.GET, "/testTender/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/testTender/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/testTender/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                //.formLogin().disable();]
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/index.html", true)
                .and()
                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID")
        ;

        /*
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/anonymous*").anonymous()
                .antMatchers("/login*").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/homepage.html", true)
                //.failureUrl("/login.html?error=true")
                .failureHandler(authenticationFailureHandler())
                .and()
                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID")
                .logoutSuccessHandler(logoutSuccessHandler());
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

         */
    }

    /*@Bean
    public UserDetailsService userDetailsService() {
        //ok for demo
        User.UserBuilder users = User.withDefaultPasswordEncoder();

        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("kvs32").password("password").roles("USER").build());
        manager.createUser(users.username("karan").password("password").roles("USER", "ADMIN").build());
        return manager;
    }*/
}
