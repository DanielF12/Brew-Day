package eda;

import java.util.ArrayList;

public class Usuarios {
    private String cpf;
    private String nome;
    private String senha;
    private ArrayList<Receitas> receitas;
    private Ingredientes ingredientes;
    
    public Usuarios(String cpf, String nome, String senha, ArrayList<Receitas> receitas, Ingredientes ingredientes){
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.receitas = receitas;
        this.ingredientes = ingredientes;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Receitas> getReceitas() {
        return receitas;
    }

    public void setReceitas(ArrayList<Receitas> receitas) {
        this.receitas = receitas;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
}
