package com.company;

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5,10);
        Retangulo r2 = new Retangulo(2,7);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimetro());
        System.out.println(r2.getCor());
        System.out.println(r2.getPerimetro());
    }
}
