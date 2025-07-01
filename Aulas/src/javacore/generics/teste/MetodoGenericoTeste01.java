package javacore.generics.teste;

import javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        criarArrayComObjeto(new Barco("Lancha"));
    }

    private static <T> void criarArrayComObjeto(T objeto){
        List<T> lista = new ArrayList<>();
        lista.add(objeto);
        System.out.println(lista);
    }

    private static <T extends Comparable> void criarArrayComObjeto(T objeto){ //outra forma de usar
        List<T> lista = new ArrayList<>();
        lista.add(objeto);
        System.out.println(lista);
    }

}
