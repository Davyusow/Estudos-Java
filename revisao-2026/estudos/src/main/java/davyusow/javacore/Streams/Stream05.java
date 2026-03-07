package davyusow.javacore.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream05 {
    public static void main(String[] args) {
        List<String> lista = List.of("Gomu", "Gomu", "No", "Mi");
        String[] palavra = lista.get(0).split("");
        IO.println(Arrays.toString(palavra));

        // uso específico para streams alinhados
        var palavras = lista.stream().map(p -> p.split("")).flatMap(Arrays::stream).toList();
        IO.println(palavras);

    }
}
