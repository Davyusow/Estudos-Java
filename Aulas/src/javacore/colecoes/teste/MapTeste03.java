package javacore.colecoes.teste;

import javacore.colecoes.dominio.Consumidor;
import javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Fulaninho");
        Consumidor consumidor2 = new Consumidor("Beltraninho");

        Manga manga1 = new Manga(3L,"Jujutsu Kaisen",50,0);
        Manga manga2 = new Manga(4L,"Naruto",40.50,5);
        Manga manga3 = new Manga(2L,"Dragon Ball",60,2);
        Manga manga4 = new Manga(5L,"Saint Seiya",45.99,4);
        Manga manga5 = new Manga(1L,"Attack on Titan",49.99,0);

        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,mangaConsumidorList);
    }
}
