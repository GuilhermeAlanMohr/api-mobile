package com.example.apimobile.controller;

import com.example.apimobile.dao.UserDAO;
import com.example.apimobile.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {

    private UserDAO userDAO;

    @Autowired
    public LoginController(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @PostMapping("/")
    public User login(@RequestBody String email, @RequestBody String senha){
        System.out.println("Chamou o método login");
//        return new User(0l,"admin","admin@admin"," ","1234");
        return this.userDAO.login(new User(email, senha));
    }

}
