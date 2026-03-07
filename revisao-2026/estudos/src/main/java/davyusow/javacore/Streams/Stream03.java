package davyusow.javacore.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import davyusow.javacore.Streams.model.LightNovel;

public class Stream03 {
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
        // lista.stream()
        // .forEach(IO::println);
        Stream<LightNovel> stream = lista.stream(); // não recomendo usar mt nn

        lista.stream().forEach(IO::println);

        var quant = lista.stream().distinct().filter(ln -> ln.getPreco() <= 40)
                .count();

        IO.println("Quantidade: " + quant);
        stream.close(); // quando você usa uma stream, ela é fechada
    }
}
