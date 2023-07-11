package com.example.apimobile.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codUser;
    private String nomeUser;
    private String email;
    private String token;
    private String senha;

    private String permissao;

    public Long getCodUser() {
        return codUser;
    }

    public void setCodUser(Long codUser) {
        this.codUser = codUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Usuario() {

    }

    public Usuario(Long codUser, String nomeUser, String email, String token, String senha) {
        this.codUser = codUser;
        this.nomeUser = nomeUser;
        this.email = email;
        this.token = token;
        this.senha = senha;
    }

    public Usuario(Long codUser, String nomeUser, String email, String token, String senha, String permissao) {
        this.codUser = codUser;
        this.nomeUser = nomeUser;
        this.email = email;
        this.token = token;
        this.senha = senha;
        this.permissao = permissao;
    }

    public Usuario(String nomeUser, String email, String token, String senha) {
        this.nomeUser = nomeUser;
        this.email = email;
        this.token = token;
        this.senha = senha;
    }

    public Usuario(String nomeUser, String email, String token, String senha, String permissao) {
        this.nomeUser = nomeUser;
        this.email = email;
        this.token = token;
        this.senha = senha;
        this.permissao = permissao;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
