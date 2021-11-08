package com.company;

public class Climatizador extends Aquecedor{
   private boolean refrigeracaoLigada = false;
   private Velocidade potRefrigerador = Velocidade.PARADA;

    public Climatizador() {}

    public Velocidade getPotRefrigerador() {
        return potRefrigerador;
    }

    public void setPotRefrigerador(Velocidade potRefrigerador) {
        this.potRefrigerador = potRefrigerador;
    }

    public boolean isRefrigeracaoLigada(){
        return refrigeracaoLigada;
    }

    public void ligarRefrigeracao(){
        refrigeracaoLigada = true;
        super.desligarAquecimento();
        potRefrigerador = Velocidade.ALTA;
    }

    public void desligarRefrigeracao(){
        refrigeracaoLigada = false;
        potRefrigerador = Velocidade.PARADA;
    }

    public void ligarAquecimento(){
        desligarRefrigeracao();
        super.ligarAquecimento();
    }

    public String toStringClimatizador(){
        return super.toStringAquecedor() + "Refrigeracao: " + refrigeracaoLigada + " Potencia Refregiracao: " + potRefrigerador;
    }
}
