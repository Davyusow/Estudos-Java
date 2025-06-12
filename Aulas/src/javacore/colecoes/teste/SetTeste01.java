package javacore.colecoes.teste;

import javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        //Set<Manga> mangas = new HashSet<>(); //Set não permite elementos duplicados
        //HashSet permite apenas elementos únicos
        //não mantém a ordem de inserção

        Set<Manga> mangas = new LinkedHashSet<>(); //mantém a ordem de inserção
        mangas.add(new Manga(3L,"Jujutsu Kaisen",50,0));
        mangas.add(new Manga(4L,"Naruto",40.50,5));
        mangas.add(new Manga(2L,"Dragon Ball",60,2));
        mangas.add(new Manga(5L,"Saint Seiya",45.99,4));
        mangas.add(new Manga(1L,"Attack on Titan",49.99,0));
        mangas.add(new Manga(1L,"Attack on Titan",49.99,0)); //não é incluso por conta do equals da classe Manga

        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
