package davyusow.javacore.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import davyusow.javacore.Streams.model.LightNovel;

// Ordenar por título
// Retornar os títulos das light novels com preço menor que 40
public class Stream01 {

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
        // Sem Streams (é...)
        lista.sort(Comparator.comparing(LightNovel::getTitulo));
        List<String> titulos = new ArrayList<>(3);
        for (LightNovel lightNovel : lista) {
            if (lightNovel.getPreco() <= 40) {
                titulos.add(lightNovel.getTitulo());
            }
            if (titulos.size() >= 3) {
                break;
            }
        }

        IO.println(lista + "\n\nTítulos filtrados:\n\n" + titulos);

    }
}
