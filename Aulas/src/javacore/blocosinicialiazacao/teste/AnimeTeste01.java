package javacore.blocosinicialiazacao.teste;

import javacore.blocosinicialiazacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        System.out.println("\n"+anime.getEpisodios());
    }
}
