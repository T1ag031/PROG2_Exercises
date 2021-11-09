package com.company;

public class Main {
    public static void main(String[] args) {
        Porto p1 = new Porto();
        Navio n1 = new Navio("ABC", "Navio1", 200);
        Navio n2 = new Navio("ABC", "Navio2", 300);
        Petroleiro n3 = new Petroleiro("DCB", "Navio3", 100,3);
        PortaContentores n4 = new PortaContentores("C123", "Navio4", 500, 25);
        PortaContentores n5 = new PortaContentores("321C", "Navio5", 1000, 75);

        p1.addNavio(n1); p1.addNavio(n2); p1.addNavio(n3); p1.addNavio(n4); p1.addNavio(n5);

        System.out.println(p1.quantidadeContentores());
        System.out.println(p1.capacidadeCarga());

        p1.listNavios();
    }
}