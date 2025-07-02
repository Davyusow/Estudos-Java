package javacore.lambda.teste;

import javacore.lambda.dominio.Anime;
import javacore.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTeste04 {
    public static void main(String[] args) {
        //Supplier<AnimeComparators> newAnimeComparators = () -> new AnimeComparators();
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("Naruto",700));
        animes.add(new Anime("Dragon ball",300));
        animes.add(new Anime("One Piece",1500));
        animes.add(new Anime("Bleach",300));

        System.out.println(animes);

        //Supplier<Anime> animeSupplier = Anime::new; //é necessário possuir um construtor sem parâmetros
        //BiFunction<String,Integer,Anime> animeBiFunction = (s,i) -> new Anime(s,i); //com lambda
        BiFunction<String,Integer,Anime> animeBiFunction = Anime::new; //bifuction permite criar com 2 parâmetros


        //maior assim com mais de um parâmetro, achei melhor com lambda
        animes.add(animeBiFunction.apply("Yu gi oh",120));
        System.out.println(animes);

    }
}
