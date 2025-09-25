package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthPageController {

    @GetMapping("/auth/login")
    public String loginPage() {
        return "auth/login";  // шукає login.html у templates/auth/
    }

    @GetMapping("/auth/register")
    public String registerPage() {
        return "auth/register";
    }
}
