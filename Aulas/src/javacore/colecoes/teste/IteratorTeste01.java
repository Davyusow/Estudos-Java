package javacore.colecoes.teste;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        //List<Manga> mangas = new ArrayList<Manga>(); //array list funciona melhor para inserções e 'gets'
        List<Manga> mangas = new LinkedList<>(); //linked list funciona melhor para remoções
        mangas.add(new Manga(3L,"Jujutsu Kaisen",50,0));
        mangas.add(new Manga(4L,"Naruto",40.50,5));
        mangas.add(new Manga(2L,"Dragon Ball",60,2));
        mangas.add(new Manga(5L,"Saint Seiya",45.99,4));
        mangas.add(new Manga(1L,"Attack on Titan",49.99,0));

//        Iterator<Manga> mangaIterator =  mangas.iterator(); //uma classe que checa antes de uma ação
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0); //programação funcional
        //a mesma coisa do código comentado acima

        System.out.println(mangas);
    }
}
