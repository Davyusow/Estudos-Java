package javacore.lambda.service;

import javacore.lambda.dominio.Anime;

public class AnimeComparators {
    public static int comparaPorTitulo(Anime a1, Anime a2){
        return a1.getTitulo().compareTo(a2.getTitulo());
    }

    public static int comparaPorEpisodio(Anime a1, Anime a2){
        return a1.getEpisodios().compareTo(a2.getEpisodios());
    }

    public int comparaPorEpisodio2(Anime a1, Anime a2){
        return a1.getEpisodios().compareTo(a2.getEpisodios());
    }
}
