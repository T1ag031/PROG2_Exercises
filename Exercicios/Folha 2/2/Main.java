package com.company;

public class Main {
    public static void main(String[] args) {
        
        
        Venda v1 = new Venda();
        System.out.println(v1.getDataVenda());
        Produto p1 = new Produto("Teste");
        Produto p2 = new Produto ("Teste2");
        v1.adicionaProduto(p1);
        v1.adicionaProduto(p2);


/*      for(int i = 0; i< v1.getProdutos().size();i++){
            System.out.println(v1.getProdutos().get(i).getNome());
        }
*/
        for (Produto produto: v1.getProdutos()){
            System.out.println(produto.getNome());
        }
    }
}
