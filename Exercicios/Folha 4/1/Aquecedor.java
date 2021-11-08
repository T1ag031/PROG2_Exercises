package com.company;

public class Aquecedor extends Ventoinha {
    private boolean resistenciaLigada = false;
    private Velocidade potResistencia = Velocidade.PARADA;

    public Aquecedor() {}

    public Velocidade getPotResistencia() {
        return potResistencia;
    }

    public void setPotResistencia(Velocidade potResistencia) {
        this.potResistencia = potResistencia;
    }

    public boolean isResistenciaLigada() {
        return resistenciaLigada;
    }

    public void ligarAquecimento(){
        resistenciaLigada = true;
        potResistencia = Velocidade.BAIXA;
    }

    public void desligarAquecimento(){
        resistenciaLigada = false;
        potResistencia = Velocidade.PARADA;
    }
    public String toStringAquecedor(){
        return "Estado Aquecedor: " + resistenciaLigada + " Potencia Aquecedor: " + potResistencia + " ";
    }
}
