package com.company;

public class Petroleiro extends Navio{
    private float carga;

    public Petroleiro(String matricula, String nome, float comprimento, float carga) {
        super(matricula, nome, comprimento);
        this.carga = carga;
    }

    public float getCarga(){
        return carga;
    }

    public void setCarga(float carga){
        this.carga = carga;
    }
}
