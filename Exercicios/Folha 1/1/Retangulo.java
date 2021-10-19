package com.company;

public class Retangulo {
    private double altura = 1;
    private double largura = 1;
    private String cor = "Branco";

    public Retangulo() {}

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea(){
        return this.altura*this.largura;
    }
    public double getPerimetro(){
        return (2*this.altura)+(2*this.largura);
    }
}
