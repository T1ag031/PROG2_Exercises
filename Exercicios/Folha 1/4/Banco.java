package com.company;

import java.util.Objects;

public class Banco {
    private ContaBancaria [] contas = new ContaBancaria[100];;
    private int index = 0;

    public ContaBancaria[] getContas() {
        return contas;
    }

    public void setContas(ContaBancaria[] contas) {
        this.contas = contas;
    }

    public void criaConta(ContaBancaria conta){
        this.contas[index] = conta;
        index++;
    }
    public ContaBancaria getConta(String titular){

        for (int i = 0 ; i < contas.length && contas[i] != null ; i++) {
            boolean b = Objects.equals(contas[i].getTitular(), titular);
            if(b) return contas[i];
        }
        return null;
    }

}