package com.company;

public class Main {
    public static void main(String[] args) {
        ContaBancaria b1 = new ContaBancaria("André");
        System.out.println(b1.getDataAbetura());
        System.out.println(b1.getInformacaoConta());
        b1.depositar(23.41);
        System.out.println(b1.getInformacaoConta());
        b1.levantar(12);
        System.out.println(b1.getInformacaoConta());
    }
}
