package javacore.colecoes.teste;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<Manga>();
        mangas.add(new Manga(3L,"Jujutsu Kaisen",50));
        mangas.add(new Manga(4L,"Naruto",40.50));
        mangas.add(new Manga(2L,"Dragon Ball",60));
        mangas.add(new Manga(5L,"Saint Seiya",45.99));
        mangas.add(new Manga(1L,"Attack on Titan",49.99));

        Collections.sort(mangas);

        Manga mangaNaBusca = new Manga(2L,"Dragon Ball",60);

        System.out.println(Collections.binarySearch(mangas,mangaNaBusca));


    }
}
