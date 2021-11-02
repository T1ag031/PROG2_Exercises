package com.company;

public class Controlo {
    private Sensor sensor;
    private Climatizador [] clima;
    private int tempMin;
    private int tempMax;
    private int index = 0;

    public Controlo() {
        sensor = new Sensor();
        clima = new Climatizador[3];
    }

    public Controlo(int tempMin, int tempMax) {
        sensor = new Sensor();
        clima = new Climatizador[3];
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public Climatizador[] getClima() {
        return clima;
    }

    public void controlar(){
        if (sensor.getTemperatura() > tempMax | sensor.getTemperatura() < tempMin){
            float i = (float)((tempMax + tempMin) / 2);
            sensor.setTemperatura(i);
        }
    }
    public void informacao(){
        System.out.println("Temperatura do sensor: " + sensor.getTemperatura());
        System.out.println("Temperatura máxima: " + getTempMax());
        System.out.println("Temperatura mínima: " + getTempMin());
        for (Climatizador i: getClima()){
            System.out.println("Climatizador #" + (index+1) + " : " + i.toStringClimatizador());
        }
    }
}
