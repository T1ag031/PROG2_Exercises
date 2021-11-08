package com.company;

public class EmprestimoLivro extends Emprestimo{
    private String titulo;
    private String autores;

    public EmprestimoLivro(int numEmprestimo, String nomeSocio, String titulo, String autores) {
        super(numEmprestimo, nomeSocio);
        this.titulo = titulo;
        this.autores= autores;
    }
}
