package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PassagemVPesado p1 = new PassagemVPesado(1,"Ford","ABCD",5);
        PassagemVeiculo v1 = new PassagemVeiculo(2, "Mustang", "XD");
        PassagemVeiculo v2 = new PassagemVeiculo(2, "Tesla", "S3XY");
        Portico portico = new Portico();
        portico.adicionaPassagem(v1);
        portico.adicionaPassagem(v2);
        /*Date data;
        data = p1.getDataPassagem();
        System.out.println(portico.numPassagens(data));*/

    }
}