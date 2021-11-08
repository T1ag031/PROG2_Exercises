package com.company;

public class ColEmprestimos {
    private Emprestimo[] emprestimos = new Emprestimo[10];

    public int quantidadeEmprestimos() {
        int n = 0;
        for (int i = 0; i < emprestimos.length - 1 && emprestimos[i] != null; i++) n++;
        return n;
    }

    public int quantidadeEmprestimosAudiolivro(){
        int n = 0;
        for(int i = 0; i < emprestimos.length - 1 && emprestimos[i] != null; i++){
            if(emprestimos[i] instanceof  EmprestimoAudiolivro) n++;
        }
        return n;
    }

    public int quantiadeEmprestimosSocio(String nome){
        int n = 0;
        for (int i = 0; i < emprestimos.length - 1 && emprestimos[i] != null; i++) {
            if(emprestimos[i].getNomeSocio().equals(nome)) n++;
        }
        return n;
    }
}
