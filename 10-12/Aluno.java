package com.company;

public class Aluno {
    private String nome = "";
    private int numAluno = 0;

    public Aluno(){}

    public Aluno(String nome) {
        this.nome = nome;
    }

// METODO GETTER
    public String getNome() {
        return this.nome;
    }

    public int getNumAluno() {
        return this.numAluno;
    }

// METODO SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumAluno(int numAluno) {
        this.numAluno = numAluno;
    }
}
