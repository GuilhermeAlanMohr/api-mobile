package com.example.apimobile.controller;

import com.example.apimobile.dao.UserDAO;
import com.example.apimobile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("usuario")
public class UserController {

    private ArrayList<User> listaUsers = new ArrayList<>();
    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @GetMapping("/usuarios")
    public List<User> getUsuarios(){
        System.out.println("Chamou o método de listagem de usuários");
//        listaUsers.add(new User("admin","admin@admin"," ","1234"));
//        listaUsers.add(new User("gui","gui@admin"," ","312ewfse"));
//        listaUsers.add(new User("user","user@admin"," ","3feferfre"));
//        return listaUsers;
        return this.userDAO.getAllUsers();
    }

    @GetMapping("/usuario")
    public User getUsuario(@RequestBody Long codigo){
        System.out.println("Chamou o método que busca um Usuário");
//        listaUsers.add(new User("admin","admin@admin"," ","1234"));
//        return listaUsers.get(0);
        User user = this.userDAO.getUser(codigo) != null ? this.userDAO.getUser(codigo).get() : null;
        return user;
    }

    @PostMapping("/cadastrar")
    public User insertUsuario(@RequestBody User user){
        System.out.println("Chamou o método de Cadastrar Usuário");
        return this.userDAO.insertUser(user);
    }

}
