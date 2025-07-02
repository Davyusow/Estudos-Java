package javacore.lambda.teste;

import javacore.lambda.dominio.Anime;
import javacore.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Naruto",700));
        animes.add(new Anime("Dragon ball",300));
        animes.add(new Anime("One Piece",1500));
        animes.add(new Anime("Bleach",300));

        animes.sort(animeComparators::comparaPorEpisodio2); //só funciona com métodos não estáticos
        //aqui é usado a instância do objeto
        System.out.println(animes);
    }
}
