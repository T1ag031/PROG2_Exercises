package com.company;

public class Classificacao {
    private int nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public Classificacao(String nome, String disciplina, int nota){
        this.aluno = new Aluno(nome);
        this.disciplina = new Disciplina(disciplina);
        this.nota = nota;

    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String printEstado(){
        return "Aluno: " + this.aluno.getNome() + " teve nota: " + this.nota + " na disciplina de " + this.disciplina.getNome();
    }
}
