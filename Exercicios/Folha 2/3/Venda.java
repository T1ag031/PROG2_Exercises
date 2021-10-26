package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private final Date dataVenda;
    private final Produto[] produtos = new Produto[20];
    private int index = 0;
    private static double nVendas = 0;
    //ArrayList<Produto> produtos = new ArrayList<>();

    public Venda(){
        this.dataVenda = new Date();
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public static double getnVendas(){
        return nVendas;
    }

    public static void setnVendas(double nVendas){
        this.nVendas = nVendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void adicionaProduto(Produto produto){
       this.produtos[index] = produto;
       nVendas++;
       index++;
    }

    public double calculaTotalVenda(){
        double resultado = 0;
        for (int i = 0; i < this.produtos.length - 1 && this.produtos[i] != null; i++) {
            resultado += this.produtos[i].getPrecoVenda();
        }
        return resultado;
    }

    public double totMargens(){
        double resultado = 0;
        for (int i = 0; i < this.produtos.length -1 && this.produtos[i] != null; i++) {
            resultado += (this.produtos[i].getPrecoVenda() - this.produtos[i].getPrecoCusto());
        }
        return resultado;
    }

    /*public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }
    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }*/



}
