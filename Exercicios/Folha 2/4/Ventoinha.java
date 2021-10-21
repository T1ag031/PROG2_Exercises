package com.company;

public class Ventoinha {
    private boolean ligado = false;
    private Velocidade velocidade = Velocidade.PARADA;

    public Ventoinha(){}

    public Velocidade getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(Velocidade velocidade){
        this.velocidade = velocidade;
        this.ligado = this.velocidade != Velocidade.PARADA;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
        this.velocidade = Velocidade.BAIXA;

    }

    public void desligar(){
        this.ligado = false;
        this.velocidade = Velocidade.PARADA;
    }

    public String toString(){
        return String.valueOf(this.velocidade);
    }
}
