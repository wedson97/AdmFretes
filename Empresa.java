package com.mycompany.empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        CadastroFrete fretes = new CadastroFrete();
        System.out.print("Quantos fretes quer adicionar?");
        int rp = c.nextInt();
        for(int i=0;i<rp;i++){
            System.out.print("Distancia:");
            int distancia = c.nextInt();
            c.nextLine();
            System.out.print("Valor: ");
            double valor = c.nextInt();
            c.nextLine();
            System.out.print("Deseja urgencia no seu pedido? (sim/nao/super) ");
            String urg = c.nextLine();
            System.out.println(urg);
            while(!"sim".equals(urg) && !"nao".equals(urg) && !"super".equals(urg)){
                System.out.print("Deseja urgencia no seu pedido? (sim/nao/super) ");
                urg = c.nextLine();
            }
            if("nao".equals(urg)){
                fretes.adicionarFrete(new FretePadrao(distancia, valor));
            }else if("sim".equals(urg)){
                System.out.println("Qual nivel: (1 a 9) ");
                int nivel = c.nextInt();
                while(nivel<1 && nivel>9){
                   System.out.println("Qual nivel: (1 a 9) ");
                   nivel = c.nextInt(); 
                }
                fretes.adicionarFrete(new FreteExpresso(distancia, valor, nivel));
            }else if("super".equals(urg)){
                fretes.adicionarFrete(new FreteSuperExpresso(distancia, valor));
            }
        }
        System.out.println("Total: "+fretes.valorTotal());
        
    }
}
