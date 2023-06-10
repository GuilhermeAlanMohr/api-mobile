package com.example.apimobile.model;

public class User {

    private int codUser;
    private String nomeUser;
    private String email;
    private String token;
    private String senha;

    public int getCodUser() {
        return codUser;
    }

    public void setCodUser(int codUser) {
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

    public User(int codUser, String nomeUser, String email, String token, String senha) {
        this.codUser = codUser;
        this.nomeUser = nomeUser;
        this.email = email;
        this.token = token;
        this.senha = senha;
    }

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
