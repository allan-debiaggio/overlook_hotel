package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable()) // indispensable si tu testes avec Postman
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/register").permitAll() // autorisé sans login
            .anyRequest().authenticated()
        )
        .formLogin(Customizer.withDefaults()); // optionnel si tu veux garder /login HTML
    return http.build();
}
}
