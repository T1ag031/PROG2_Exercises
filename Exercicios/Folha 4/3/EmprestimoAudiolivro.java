package com.company;

public class EmprestimoAudiolivro extends Emprestimo{
    private String titulo;
    private float duracao;

    public EmprestimoAudiolivro(int numEmprestimo, String nomeSocio, String titulo, float duracao) {
        super(numEmprestimo, nomeSocio);
        this.titulo = titulo;
        this.duracao = duracao;
    }
}
