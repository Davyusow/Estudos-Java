package javacore.polimorfismo.teste;

import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Recifense",9);
        tomate.setDataValidade("27/06/2025");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
