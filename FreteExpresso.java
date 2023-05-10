package com.mycompany.empresa;

public class FreteExpresso extends Frete {
    private int nivel;
    
    public FreteExpresso(){
        super();
    }
    public FreteExpresso(int distancia, double valor, int nivel){
        super(distancia, valor);
        this.nivel = nivel;
    }
    @Override
    public double calcularFrete(){
        return (super.getKm()*super.getValor())+(this.nivel*100);
    }
}
