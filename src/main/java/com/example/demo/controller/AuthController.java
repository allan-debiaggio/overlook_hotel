package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthController {

    
    @PostMapping("/register")
    public AuthRequest register(@RequestBody AuthRequest req) {
    
        System.out.println(req);
        return req;
    }
    @PostMapping("/admin/login") 
    // page de connection manager et employers
    public AuthRequest admLoginRequest(@RequestBody AuthRequest req){
        return req;
        
    }

    @PostMapping("/user/login")
    // page de connection clients
    public AuthRequest UserLoginRequest(@RequestBody AuthRequest req){
        return req;
        
    }

    public record AuthRequest(String username, String password) {}
    
}
