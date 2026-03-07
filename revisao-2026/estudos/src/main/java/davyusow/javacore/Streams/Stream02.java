package davyusow.javacore.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import davyusow.javacore.Streams.model.LightNovel;

// Ordenar por título
// Retornar os títulos das light novels com preço menor que 40
public class Stream02 {
    private static List<LightNovel> lista = new ArrayList<>(List.of(
            new LightNovel("Sword Art Online", 35.00),
            new LightNovel("RE-ZERO", 80.90),
            new LightNovel("Overlord", 50.00),
            new LightNovel("Shield Hero", 36.90),
            new LightNovel("Fate: Stay Night", 25.90),
            new LightNovel("Danganronppa", 10.90),
            new LightNovel("Monogatari", 20.90),
            new LightNovel("No Game No Life", 30.90)));

    public static void main(String[] args) {
        var resultado = lista.stream()
                .sorted(Comparator.comparing(LightNovel::getTitulo))
                .filter(l -> l.getPreco() <= 40)
                .limit(3)
                .map(LightNovel::getTitulo)
                .toList();

        IO.println(lista);
        IO.println(resultado);

    }
}
