package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private final Date dataVenda;
    // private final Produto[] produtos = new Produto[20];
    ArrayList<Produto> produtos = new ArrayList<>();

    public Venda(){
        this.dataVenda = new Date();
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }
    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

}
