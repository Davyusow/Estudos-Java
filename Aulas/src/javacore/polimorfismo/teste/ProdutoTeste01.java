package javacore.polimorfismo.teste;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Produto produto = new Computador("Nuc10",10000);
        Tomate tomate = new Tomate("Vermelho",5);
        Televisao tv = new Televisao("Samsung",3000);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
