package com.mycompany.empresa;

public abstract class Frete implements Fretavel{
    private int km;
    private double valor;
    
    public Frete(){
    }
    public Frete(int km, double valor){
        this.km = km;
        this.valor = valor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
