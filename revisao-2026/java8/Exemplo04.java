package java8;

import java.util.Arrays;
import java.util.List;

public class Exemplo04 {

    public static void main(String[] args) {
        List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        valores.stream().forEach(e -> System.out.println(e)); // Ajuda a evitar o for (3 linhas)

        valores
            .stream() // normalmente uma forma melhor de iterar os dados
            .filter(v -> v % 2 == 0) //Filtra somente os númeors pares e imprime cada elemento na tela
            .forEach(v -> System.out.println(v));
    }
}
