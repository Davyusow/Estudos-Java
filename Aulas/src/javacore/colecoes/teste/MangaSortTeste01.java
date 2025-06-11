package javacore.colecoes.teste;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortMangaById implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getId().compareTo(m2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(3L,"Jujutsu Kaisen",50));
        mangas.add(new Manga(4L,"Naruto",40.50));
        mangas.add(new Manga(2L,"Dragon Ball",60));
        mangas.add(new Manga(5L,"Saint Seiya",45.99));
        mangas.add(new Manga(1L,"Attack on Titan",49.99));
        System.out.println(mangas);

        System.out.println("\nApós a ordenação\n");

        //Collections.sort(mangas);
        //Collections.sort(mangas,new SortMangaById()); //necessário implementar um compareTo na classe
        mangas.sort(new SortMangaById()); //assim também funciona

        System.out.println(mangas);
    }
}
