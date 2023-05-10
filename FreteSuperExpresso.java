package com.mycompany.empresa;

public class FreteSuperExpresso extends Frete{
    
    public FreteSuperExpresso(){
        super();
    }
    
    public FreteSuperExpresso(int distancia, double valor){
        super(distancia, valor);
    }
    @Override
    public double calcularFrete(){
        double seguro = super.getValor()*0.1;
        int nivel = 10;
        return (super.getKm()*super.getValor())+(nivel*100)+seguro;
    }
}
