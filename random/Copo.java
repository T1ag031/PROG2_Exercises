package com.company;

public class Copo {
    private boolean vazio = true;
    private double capMaxima = 0;
    private double qtLiquido = 0;
    private String tipoLiquido;

    public Copo(double capMaxima, double qtLiquido, String tipoLiquido) {
        this.capMaxima = capMaxima;
        this.qtLiquido = qtLiquido;
        this.tipoLiquido = tipoLiquido;

        if (qtLiquido != 0) vazio = false;
        if (qtLiquido > capMaxima) System.out.println("Copo Cheio!");
    }

    public double getCapMaxima() {
        return capMaxima;
    }

    public double getQtLiquido() {
        return qtLiquido;
    }

    public String getTipoLiquido() {
        return tipoLiquido;
    }

    public double getPercentagemLiquido(){
        return (qtLiquido / capMaxima) * 100;
    }
    public void isCheio(){
        if (capMaxima == qtLiquido) {
            System.out.println("Copo Cheio!!");
        }else{
            System.out.println("Quantidade disponível: " + (qtLiquido / capMaxima) * 100);
        }
    }

    public void esvaziar(double qtLiquido){
        if (qtLiquido > this.qtLiquido){
            System.out.println("Excede a quantidade de líquido!");
        } else if (qtLiquido == this.qtLiquido){
            this.qtLiquido = 0;
            vazio = true;
            tipoLiquido = null;
        } else if ( qtLiquido < this.qtLiquido){
            this.qtLiquido = this.qtLiquido - qtLiquido;
        }
    }

    public void encher(double qtLiquido, String tipoLiquido){
        if (qtLiquido + this.qtLiquido > capMaxima){
            System.out.println("Transborda!");
        } else if (qtLiquido + this.qtLiquido == capMaxima){
            this.qtLiquido = capMaxima;
            System.out.println("Copo Cheio!");
        } else if (qtLiquido + this.qtLiquido < capMaxima){
            this.qtLiquido = qtLiquido + this.qtLiquido;
        }
        if (vazio){
            this.qtLiquido = qtLiquido;
            this.tipoLiquido = tipoLiquido;
        }
    }
}
