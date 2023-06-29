package com.example.apimobile.controller;

import com.example.apimobile.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {

    @PostMapping("/")
    public User login(String email, String senha){
        System.out.println("Chamou o método login");
        return new User(0,"admin","admin@admin"," ","1234");
    }

}
