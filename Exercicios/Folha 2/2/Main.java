package com.company;

public class Main {
    public static void main(String[] args) {


        Venda v1 = new Venda();
        System.out.println(v1.getDataVenda());
        Produto p1 = new Produto("Batatas", 2.50,3);
        Produto p2 = new Produto ("CocaCola", 5, 10);

        System.out.println(v1.calculaTotalVenda());
        System.out.println(v1.totMargens());

        /*for(int i = 0; i< v1.getProdutos().size();i++){
        v1.adicionaProduto(p1);
        v1.adicionaProduto(p2);
            System.out.println(v1.getProdutos().get(i).getNome());
        }

        for (Produto produto: v1.getProdutos()){
            System.out.println(produto.getNome());
        }*/
    }
}
