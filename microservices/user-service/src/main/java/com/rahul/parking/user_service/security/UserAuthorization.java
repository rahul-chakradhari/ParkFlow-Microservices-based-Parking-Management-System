package com.rahul.parking.user_service.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserAuthorization {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //used method chaining  for seq of filters for every HTTP req for authorization
        http
                .csrf(csrf->csrf.disable())
                .formLogin(form->form.disable())
                .httpBasic(basic->basic.disable())
                .authorizeHttpRequests(a->a
                        .requestMatchers("/user/**").permitAll()
                        .requestMatchers("/").permitAll()
                        .anyRequest().authenticated()
                );
        return http.build();
    }

}
