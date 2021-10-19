package com.company;

public class Main {
    public static void main(String[] args) {
        ContaBancaria b1 = new ContaBancaria("André");
        ContaBancaria b2 = new ContaBancaria("Joao");
        System.out.println(b1.getDataAbetura());
        //System.out.println(b1.getInformacaoConta());
        b1.depositar(23.41);
        //System.out.println(b1.getInformacaoConta());
        b1.levantar(12);
        //System.out.println(b1.getInformacaoConta());

        Banco contas = new Banco();
        contas.criaConta(b1);
        contas.criaConta(b2);
        //contas.getContas()[0].getInformacaoConta();
        ContaBancaria[] contasBancarias = contas.getContas();
        for (int i = 0 ; i < contasBancarias.length && contasBancarias[i] != null ; i++) {
            System.out.println(contasBancarias[i].getInformacaoConta());
        }
        try {
            System.out.println(contas.getConta("Joao").getInformacaoConta());
        } catch (Exception e){
            System.out.println("Conta não encontrada!");
        }
    }
}
