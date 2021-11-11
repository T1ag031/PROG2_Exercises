package com.company;

import java.util.ArrayList;
import java.util.List;

public class VendaServicos extends Venda{
    private List<String> servicosList = new ArrayList<>();

    public VendaServicos(int numVenda, float valor) {
        super(numVenda, valor);
    }

    public List<String> getServicosList() {
        return servicosList;
    }

    public void setServicosList(List<String> servicosList) {
        this.servicosList = servicosList;
    }
}
