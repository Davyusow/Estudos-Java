package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Aula03 {

    public static void main(String[] args) {
        List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> resultado = valores.stream().reduce((n1, n2) -> n1 + n2);
        // Retorna o valor da soma de todos os valores da stream
        // Logo o reduce retorna o valor da operação em todos os valores da stream

        System.out.println(resultado.orElseThrow(() -> new RuntimeException("Deu pau")));
    }
}
