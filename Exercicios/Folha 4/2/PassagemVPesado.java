package com.company;

public class PassagemVPesado extends PassagemVeiculo{
    private int numEixos;

    public PassagemVPesado(int cod, String marca, String matricula, int numEixos) {
        super(cod, marca, matricula);
        this.numEixos = numEixos;
    }

    public void setNumEixos(int numEixos){

        this.numEixos = numEixos;
    }

    public int getNumEixos(){

        return numEixos;
    }
}
