package java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Aula02 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 5, 7, 7, 4, 8, 1, 9, 10);

        long quantidade = lista
            .stream()
            .map(e -> e * 2)
            .count(); // retorna a quantidade de valores do stream
        //útil com o uso de skip, distinct e filter

        var maior = lista.stream().distinct().max(Comparator.naturalOrder()); // Usa o compareTo do pŕorpio Integer
        //retorna um optional
        // max e min são operações finais, pois retornam valores
        //

        // List<Integer>
        var resultado = lista.stream().collect(Collectors.toList());
        // collect(Collectors.toList()) retorna uma nova lista!

        // Map<Boolean, List<Integer>>
        var grupo = lista
            .stream()
            .map(e -> e * 3)
            .collect(Collectors.groupingBy(e -> e % 2 == 0));

        // joining só trabalha com strings
        // String
        var texto = lista
            .stream()
            .map(e -> String.valueOf(e))
            .collect(Collectors.joining(";")); // ele junta todas as strings em uma só
            // O argumento da função insere um delimitador nos elementos

        System.out.println("Valores pares: " + grupo);

        System.out.println("Tudo junto: %s".formatted(texto));

        System.out.println("Todos os valores: %s".formatted(resultado));

        System.out.println("Quantidade: %d".formatted(quantidade));

        System.out.println("Maior valor: %d".formatted(maior.get()));

        // Lembrar de fazer exemplo, limit e skip usados para limitar os elementos
        // Impressos na tela!

        // streams são loops implícitos, que normalmente são melhores
        // É mais fácil de aplicar multithread!
    }
}
