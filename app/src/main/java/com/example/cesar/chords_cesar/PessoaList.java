package com.example.cesar.chords_cesar;

import java.util.LinkedList;
import java.util.List;

public class PessoaList {

    List<Pessoa> pessoas = new LinkedList<>();

    public PessoaList(){
        initializePessoas();
    }

    public Pessoa searchLogin(String login, String senha){

        List<Pessoa> encontrada = new LinkedList<>();
        for(Pessoa pes:pessoas) if (pes.getLogin().matches(login) && pes.getSenha().matches(senha)) return pes;
        return null;

    }

    public void initializePessoas(){
        this.pessoas.add(new Pessoa("Giuliano", "juju", "senha"));
        this.pessoas.add(new Pessoa("Administrador", "adm", "admin"));
    }
}
