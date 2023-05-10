package com.mycompany.empresa;

public class FretePadrao extends Frete{
    
    public FretePadrao(){
        super();
    }
    public FretePadrao(int distancia, double valor){
        super(distancia, valor);
    }
    
    @Override
    public double calcularFrete(){
        return super.getKm() * super.getValor();
    }
}
