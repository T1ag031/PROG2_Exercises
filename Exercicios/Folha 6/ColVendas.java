package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColVendas {
    private final List<Venda> vendaList = new ArrayList<>();

    public void adicionaVenda(Venda venda){
        for (Venda i:
             vendaList) {
            if (i.getNumVenda() == venda.getNumVenda()){
                System.out.println("Número já registado!!");
                return;
            }
        }
        vendaList.add(venda);
    }

    public int quantidadeData(Date data){
        int total = 0;

        for (Venda i:
             vendaList) {
            if (i.getData().equals(data)) total++;
        }
        return total;
    }

    public int quantidadeVendas(){
        int total = 0;
        for (Venda i:
             vendaList) {
            if (i instanceof VendaArtigos) total += ((VendaArtigos) i).getArtigoList().size();
        }
        return total;
    }

    public float valorData(Date data){
        float total = 0;

        for (Venda i:
                vendaList) {
            if (i.getData().equals(data)) total+= i.getValor();
        }
        return total;
    }
}
