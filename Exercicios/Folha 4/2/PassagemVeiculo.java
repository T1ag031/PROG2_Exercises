package com.company;

import java.util.Date;

public class PassagemVeiculo {
    private final int cod;
    private final Date dataPassagem;
    private String marca;
    private String matricula;

    public PassagemVeiculo(int cod, String marca, String matricula){
        dataPassagem = new Date();
        this.cod = cod;
        this.marca = marca;
        this.matricula = matricula;
    }

    public void setMarca(String marca){

        this.marca = marca;
    }

    public void setMatricula(String matricula){

        this.matricula = matricula;
    }

    public Date getDataPassagem() {

        return dataPassagem;
    }

    public int getCod(){

        return cod;
    }

    public String getMarca(){

        return marca;
    }

    public String getMatricula(){
        return matricula;
    }
}
