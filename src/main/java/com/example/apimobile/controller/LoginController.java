package com.example.apimobile.controller;

import com.example.apimobile.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {

    @PostMapping("/")
    public User login(@RequestBody String email, @RequestBody String senha){
        System.out.println("Chamou o método login");
        return new User(0l,"admin","admin@admin"," ","1234");
    }

}
