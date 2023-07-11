package com.example.apimobile.dao;

import com.example.apimobile.model.Usuario;
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

    public Usuario login(String email){
        Usuario usuario = this.userRepository.findByEmailIgnoreCase(email).get();
        if (usuario != null) {
            return this.userRepository.findUserByEmailAndSenha(usuario.getEmail(), usuario.getSenha()).get();
        }
        return null;
    }

    public Optional<Usuario> getUser(Long codigo) {
        return this.userRepository.findById(codigo);
    }

    public List<Usuario> getAllUsers(){
        return this.userRepository.findAll();
    }

    public Usuario insertUser(Usuario user){
        return this.userRepository.save(user);
    }

}
