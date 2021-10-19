package com.company;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ContaBancaria {
    private final String titular;
    private double saldo = 0.0;
    private final Date dataAbetura = new Date();
    private final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat df = new DecimalFormat("0.00");

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbetura() {
        return dataAbetura;
    }
// Ex.: Titular: José Fonseca Saldo: €321.50 Data Abertura: 21/2/2017.
    public String getInformacaoConta(){
       return "Titular: " + this.titular + " Saldo: " + df.format(this.saldo).replace(",", ".") + "€ Data Abertura: " + data.format(dataAbetura) + ".";
    }
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    public void levantar(double saldo){
        this.saldo -= saldo;
    }
}
