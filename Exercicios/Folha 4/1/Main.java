package com.company;

public class Main {
    public static void main(String[] args) {
        Aquecedor a1 = new Aquecedor();
        a1.ligarAquecimento();
        a1.setPotResistencia(Velocidade.MEDIA);
        System.out.println(a1.toStringAquecedor());
        a1.desligarAquecimento();
        System.out.println(a1.toStringAquecedor());
        Climatizador c1 = new Climatizador();
        c1.ligarRefrigeracao();
        System.out.println(c1.toStringClimatizador());
        c1.ligarAquecimento();
        System.out.println(c1.toStringClimatizador());
    }
}