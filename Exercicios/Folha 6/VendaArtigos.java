package com.company;

import java.util.ArrayList;
import java.util.List;

public class VendaArtigos extends Venda{
    private List<String> artigoList = new ArrayList<>();

    public VendaArtigos(int numVenda, float valor) {
        super(numVenda, valor);
    }

    public List<String> getArtigoList() {
        return artigoList;
    }

    public void setArtigoList(List<String> artigoList) {
        this.artigoList = artigoList;
    }
}
