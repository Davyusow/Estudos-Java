package davyusow.javacore.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);

        {
            mangas.add("Saint Seiya");
            mangas.add("Naruto");
            mangas.add("Dragon Ball");
            mangas.add("Boku no Hero");
            mangas.add("Attack on titan");
            mangas.add("One Punch Man");
        }

        IO.println("Antes da ordenação: ");
        mangas.forEach(IO::println);
        Collections.sort(mangas);

        IO.println("\nDepois da ordenação: ");
        mangas.forEach(IO::println);

        List<Double> valores = new ArrayList<>();

        {
            valores.add(100.21);
            valores.add(21.21);
            valores.add(500.10);
            valores.add(15.99);
            valores.add(223.44);
        }

        IO.println("\nAntes da ordenação: ");
        valores.forEach(IO::println);

        Collections.sort(valores);

        IO.println("\nDepois da ordenação: ");
        valores.forEach(IO::println);

    }
}
