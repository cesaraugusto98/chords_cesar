package com.example.cesar.chords_cesar;

public class Pessoa {

    private String nome;
    private String login;
    private String senha;

    public Pessoa(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }

    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }

}
