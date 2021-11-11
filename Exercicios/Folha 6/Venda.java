package com.company;

import java.util.Date;

public class Venda {
    private int numVenda;
    private final Date dataVenda = new Date();
    private float valor;

    public Venda(int numVenda, float valor) {
        this.numVenda = numVenda;
        this.valor = valor;
    }

    public int getNumVenda() {
        return numVenda;
    }

    public void setNumVenda(int numVenda) {
        this.numVenda = numVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData(){
        return dataVenda;
    }
}
