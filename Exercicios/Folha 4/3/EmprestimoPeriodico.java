package com.company;

public class EmprestimoPeriodico extends Emprestimo{
    private String titulo;

    public EmprestimoPeriodico(int numEmprestimo, String nomeSocio, String titulo) {
        super(numEmprestimo, nomeSocio);
        this.titulo = titulo;
    }
}
