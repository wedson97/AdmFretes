package com.mycompany.empresa;

import java.util.ArrayList;
import java.util.List;

public class CadastroFrete {
    List<Frete> lista = new ArrayList<>();
    
    public CadastroFrete(){
    }
    
    public void adicionarFrete(Frete frete){
        lista.add(frete);
    }
    public double valorTotal(){
        double total = 0;
        for(Frete frete: lista){
            total+=frete.calcularFrete();
        }
        return total;
    }
}
