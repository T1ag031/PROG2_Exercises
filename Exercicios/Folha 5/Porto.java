package com.company;

import java.util.ArrayList;
import java.util.List;

public class Porto {
    private final List<Navio> navioList = new ArrayList<>();

    public Porto() {}

    public void addNavio(Navio navio){
        for (Navio o : navioList) {
            if (o.getMatricula().equals(navio.getMatricula())){
                System.out.println("Matricula já registada!");
                return;
            }
        }
        navioList.add(navio);
    }

    public int quantidadeContentores(){
        int total = 0;

        for (Navio o : navioList) {
            if (o instanceof PortaContentores) total += ((PortaContentores) o).getNumContentores();
        }
        return total;
    }

    public float capacidadeCarga(){
        float total = 0;
        for (Navio o : navioList) {
            if(o instanceof Petroleiro) total += ((Petroleiro) o).getCarga();
        }
        return total + (quantidadeContentores() * 10);
    }

    public void listNavios(){
        navioList.stream().map(Navio::getNome).forEach(System.out::println);
        //navioList.stream().map(Navio::getNome).forEach(s -> System.out.println(s));
    }
}