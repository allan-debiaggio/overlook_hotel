package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//ici ajouter une route permettant de recevoir dans postman "Coucou l'ami"
@RestController
public class AuthController {
    @PostMapping("/register")
    public RegisterRequest register(@RequestBody RegisterRequest req) {
    
        System.out.println(req);
        return req;
    

    
}
public record RegisterRequest(String username, String password) {}
}
