package com.example.apimobile.dao;

import com.example.apimobile.model.User;
import com.example.apimobile.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {

    private UserRepository userRepository;

    public UserDAO(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User login(User user){
        return this.userRepository.findUserByEmailAndSenha(user.getEmail(), user.getSenha());
    }

}
