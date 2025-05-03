package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto do produto: "+imposto);
        if(produto instanceof Tomate){  //se produto for uma instância de tomate
            System.out.println(((Tomate) produto).getDataValidade());
        }
    }

}
