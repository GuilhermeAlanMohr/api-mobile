package com.example.apimobile.controller;

import com.example.apimobile.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("usuario")
public class UserController {

    private ArrayList<User> listaUsers = new ArrayList<>();

    @GetMapping("/usuarios")
    public List<User> getUsuarios(){
        listaUsers.add(new User("admin","admin@admin"," ","1234"));
        listaUsers.add(new User("gui","gui@admin"," ","312ewfse"));
        listaUsers.add(new User("user","user@admin"," ","3feferfre"));
        return listaUsers;
    }

    @GetMapping("/usuario")
    public User getUsuario(){
        System.out.println("Chamou o método");
        listaUsers.add(new User("admin","admin@admin"," ","1234"));
        return listaUsers.get(0);
    }

}
