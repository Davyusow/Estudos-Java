package javacore.lambda.teste;

import javacore.lambda.dominio.Anime;
import javacore.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Naruto",700));
        animes.add(new Anime("Dragon ball",300));
        animes.add(new Anime("One Piece",1500));
        animes.add(new Anime("Bleach",300));

//        Collections.sort(animes, (a1,a2) -> a1.getTitulo().compareTo(a2.getTitulo()));
//        Collections.sort(animes, (a1, a2) -> AnimeComparators.comparaPorTitulo(a1,a2));
        //quando é passado apenas um método é possível simplificar ainda mais com methodReference

        //referência para métodos estáticos
        Collections.sort(animes, AnimeComparators::comparaPorTitulo);
        System.out.println(animes);
        Collections.sort(animes, AnimeComparators::comparaPorEpisodio);//aqui rolou uma coincidência mas funciona
        System.out.println(animes);
    }
}
