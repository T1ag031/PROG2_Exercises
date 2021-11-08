package com.company;

import java.util.Date;

public class Portico {
    private final PassagemVeiculo[] passagens = new PassagemVeiculo[20];
    private int index = 0;

    public void adicionaPassagem(PassagemVeiculo passagem){
        /*if (passagens[0] == null){
            passagens[index] = passagem;
            index++;
            return;
        }
        for(PassagemVeiculo i : passagens){
            if(i.getCod()==passagem.getCod()){
                System.out.println("Código já registado!!");
                return;
            }
        }*/
        for(int i = 0; i < passagens.length -1 && passagens[i]!= null;i++){
            if(passagens[i].getCod() == passagem.getCod()){
                System.out.println("Código já registado!!");
                return;
            }
        }
        passagens[index] = passagem;
        index++;
    }

    public int numPassagens(Date data){
        int num = 0;
        /*for (PassagemVeiculo i : passagens && i != null){
            if(i.getDataPassagem() == data) num++;
        }*/

        for(int i = 0; i < passagens.length -1 && passagens[i]!= null;i++){
            if(passagens[i].getDataPassagem().equals(data)) num++;
        }
        return num;
    }
}
