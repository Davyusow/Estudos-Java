package davyusow.javacore.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import davyusow.javacore.Collections.model.Manga;

public class MangaSort {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(10);

        {
            mangas.add(new Manga("Helsing Ultimate", 19.9D));
            mangas.add(new Manga("Dragon Ball", 200.99D));
            mangas.add(new Manga("Beserk", 89.90D));
            mangas.add(new Manga("Atack on Titan", 79.90D));
            mangas.add(new Manga("JoJo Bizzarre Adventures", 99.90D));
        }
        IO.println(mangas);

        IO.println("\n\nApós a ordenação");
        Collections.sort(mangas);

        mangas.forEach(IO::println);
    }
}
