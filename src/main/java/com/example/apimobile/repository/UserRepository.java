package com.example.apimobile.repository;

import com.example.apimobile.model.Usuario;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findUserByEmailAndSenha(String email, String senha);

    Optional<Usuario> findByEmailIgnoreCase(@NotNull String email);

}
