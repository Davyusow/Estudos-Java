package javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Jujutsu Kaisen");
        mangas.add("Naruto");
        mangas.add("Dragon Ball");
        mangas.add("Saint Seiya");
        mangas.add("Attack on Titan");

        for(String manga : mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("\nApós o sort\n");
        for(String manga : mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(99.0);
        dinheiros.add(189.05);
        dinheiros.add(3.1);
        dinheiros.add(4.2);

        for(Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }
        System.out.println("\nApós o sort\n");
        Collections.sort(dinheiros);
        for(Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }


    }
}
