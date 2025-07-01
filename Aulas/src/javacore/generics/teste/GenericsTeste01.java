package javacore.generics.teste;

import javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoryia");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista,new Consumidor("Fulano")); //funciona mas troca o tipo da lista para um mais genérico em tempo de execução
//        for (String o : lista) {
//            System.out.println(o);
//        }
        for (Object o : lista) {
            System.out.println(o);
        }
    }
    public static void add(List list,Consumidor consumidor){
        list.add(consumidor);
    }
}
