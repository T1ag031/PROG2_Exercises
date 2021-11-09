package com.company;

public class PortaContentores extends Navio{
    private int numContentores;

    public PortaContentores(String matricula, String nome, float comprimento, int numContentores){
        super(matricula, nome, comprimento);
        this.numContentores = numContentores;
    }

    public float getNumContentores(){
        return numContentores;
    }

    public void setNumContentores(int numContentores){
        this.numContentores = numContentores;
    }
}
