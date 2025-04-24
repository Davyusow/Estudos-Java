package javacore.sobrecargametodos.teste;

import javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
        anime1.setTipo("TV");
        anime1.setEpisodios(12);
        anime1.setNome("Akudama Drive");
        anime1.setGenero("Ação");
        anime1.imprime();

        Anime anime2 = new Anime();
        anime2.init("Mob","TV",12,"Ação");
        anime2.imprime();

        Anime anime3 = new Anime();
        anime3.init("Yuyu Hakushou","TV",112);
        anime3.setGenero("Shonen");

        Anime anime4 = new Anime("Naruto Shipudden","TV",500,"Shonen");
        anime4.imprime();

        Anime anime5 = new Anime();
        anime5.imprime();
    }
}
