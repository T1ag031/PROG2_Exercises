package com.company;

public class Main {
    public static void main(String[] args) {
        Ventoinha v1 = new Ventoinha();
        System.out.println(v1);
        v1.ligar();
        System.out.println(v1.getVelocidade());
        System.out.println(v1.isLigado());
        v1.setVelocidade(Velocidade.ALTA);
        System.out.println(v1);
        v1.setVelocidade(Velocidade.MEDIA);
        System.out.println(v1.isLigado());
        System.out.println(v1.getVelocidade());
        v1.desligar();
        System.out.println(v1.isLigado());
        System.out.println(v1);
    }
}