package com.company;

/*

*/

public class Main {

    public static void main(String[] args) {
       Aluno a1 = new Aluno();
       Aluno a2 = new Aluno("Maria");
       a1.setNome("Manuel"); a1.setNumAluno(25);
       System.out.println("Nome Aluno: " + a1.getNome());
       System.out.println("Nome Aluno: " + a2.getNome());
       a2.setNome("André"); a2.setNumAluno(52);
       System.out.println("Nome Aluno: " + a2.getNome());

       Disciplina d1 = new Disciplina("Programação II");
       System.out.println("D1: " + d1.getNome());

       Classificacao nota1 = new Classificacao(a1.getNome(), d1.getNome(),18);
       System.out.println(nota1.printEstado());

       Classificacao nota2 = new Classificacao(a2.getNome(), d1.getNome(), nota1.getNota());
       System.out.println(nota2.printEstado());
    }
}
