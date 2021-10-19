package com.company;

public class Circunferencia {
    private double raio = 1;

    public Circunferencia(){}

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI*(raio*raio);
    }

    public double getPerimetro(){
        return 2*Math.PI*raio;
    }
}

