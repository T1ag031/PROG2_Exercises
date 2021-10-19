package com.company;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.setNome("Batatas"); p1.setPrecoCusto(15.99); p1.setPrecoVenda(35.99);
        p2.setNome("Sumo"); p2.setPrecoCusto(12.99); p2.setPrecoVenda(29.99);
        System.out.println(p1.getNome() +" "+ p1.getPrecoCusto() +" "+ p1.getPrecoVenda());
        System.out.println(p2.getNome() +" "+ p2.getPrecoCusto() +" "+ p2.getPrecoVenda());
        System.out.println(p1.getMargemLucro());
        System.out.println(p1.getPercentMargemLucro());
        System.out.println(p2.getMargemLucro());
        System.out.println(p2.getPercentMargemLucro());
    }
}
