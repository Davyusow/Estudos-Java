package javacore.polimorfismo.teste;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Chromebook",1500); //polimorfismo é criar um objeto usando uma classe mãe
        //como uma instância de uma subclasse, no caso, Produto > Computador, Tomate
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());

        Produto produto02 = new Tomate("Tomate vermelhinho",12);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());


    }
}
