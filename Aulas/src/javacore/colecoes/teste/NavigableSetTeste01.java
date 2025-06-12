package javacore.colecoes.teste;

import javacore.colecoes.dominio.Manga;
import javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> celulares = new TreeSet<>(new SmartphoneMarcaComparator()); //precisa de um comparable/comparator
        Smartphone s1 = new Smartphone("123","Nokia");
        celulares.add(s1);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(3L,"Jujutsu Kaisen",50,0));
        mangas.add(new Manga(4L,"Naruto",40.50,5));
        mangas.add(new Manga(2L,"Dragon Ball",60,2));
        mangas.add(new Manga(5L,"Saint Seiya",45.99,4));
        mangas.add(new Manga(1L,"Attack on Titan",49.99,0));
        System.out.println(mangas);
    }
}
