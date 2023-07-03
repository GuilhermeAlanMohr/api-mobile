package com.example.apimobile.dao;

import com.example.apimobile.model.User;
import com.example.apimobile.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDAO {

    private UserRepository userRepository;

    public UserDAO(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User login(User user){
        return this.userRepository.findUserByEmailAndSenha(user.getEmail(), user.getSenha());
    }

    public Optional<User> getUser(Long codigo) {
        return this.userRepository.findById(codigo);
    }

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    public User insertUser(User user){
        return this.userRepository.save(user);
    }

}
