package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       //Set<Produto> produto = new HashSet<>();
        Stack<Produto> stack = new StackClass<>();

        stack.push(new Produto("Banana", 1));
        stack.push(new Produto("Apple", 2));
        System.out.println(stack.top().getNome() + " " + stack.top().getCod());
        stack.pop();
        System.out.println(stack.top().getNome() + " " + stack.top().getCod());

        Set<Integer> conjInteiros = new HashSet<>();

        conjInteiros.add(5);
        conjInteiros.add(3);
        conjInteiros.add(1);
        conjInteiros.add(4);
       /* for (int i : conjInteiros) {
            System.out.println(i);
        }*/

        conjInteiros.forEach(System.out::println);

        if (conjInteiros.contains(5)) System.out.println("Hurray!!");
    }
}