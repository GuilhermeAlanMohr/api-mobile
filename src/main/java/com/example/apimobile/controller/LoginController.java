package com.example.apimobile.controller;

import com.example.apimobile.dao.UserDAO;
import com.example.apimobile.model.Usuario;
import com.example.apimobile.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDAO userDAO;

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<Object> autenticacao(@RequestBody Usuario usuario){

        System.out.println("login: "+usuario.getEmail());
        System.out.println("senha: "+usuario.getSenha());
        try{
            final Authentication authentication = this.authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(usuario.getEmail(), usuario.getSenha()));

            if(authentication.isAuthenticated()){
                //colocamos nossa instancia autenticada no contexto do spring security
                SecurityContextHolder.getContext().setAuthentication(authentication);

                Usuario user = userDAO.login(usuario.getEmail());

                System.out.println("Gerando token de autorizacao ****");
                String token = new JWTUtil().geraToken(usuario);

                user.setToken(token);
                user.setSenha("semsenha");

                return new ResponseEntity<>(user, HttpStatus.OK);
            }

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("Usuário ou senha incorretos!", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Usuário ou senha incorretos!", HttpStatus.BAD_REQUEST);
    }

}
