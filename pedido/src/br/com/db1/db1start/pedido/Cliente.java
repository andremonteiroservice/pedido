package br.com.db1.db1start.pedido;

import jdk.jshell.Snippet;

public class Cliente {
    private String nome;
    private String cpf;
    private StatusCliente status;

    public Cliente(String nome, String cpf, StatusCliente status){
        this.nome = nome;
        this.cpf = cpf;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public StatusCliente getStatus() {
        return status;
    }
}
