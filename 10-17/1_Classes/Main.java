package com.company;

/*

*/

public class Main {

    public static void main(String[] args) {
        Class1 c = new Class1();
        Class1 d = new Class1();
        System.out.println(c.x);
        System.out.println(d.x);
        c.printHi();
        d.printHi();

        Class2 e = new Class2();
        System.out.println(e.y);
    }
}