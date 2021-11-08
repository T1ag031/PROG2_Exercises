package com.company;

import java.util.Date;

public class Emprestimo {
    private int numEmprestimo;
    private Date dataEmprestimo;
    private String nomeSocio;

    public Emprestimo(int numEmprestimo, String nomeSocio){
        dataEmprestimo = new Date();
        this.numEmprestimo = numEmprestimo;
        this.nomeSocio = nomeSocio;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }
}
