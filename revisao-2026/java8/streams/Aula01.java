package java8.streams;

import java.util.Arrays;
import java.util.List;

public class Aula01 {
    // O stream é um fluxo de dados, onde basicamente cada dado de uma lista passa
    // pelo stream pelo menos uma vez

    public static boolean par(Integer valor) {
        return valor % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> valores = Arrays.asList(1, 2, 34, 2, 6, 8, 2, 5, 8, 5, 7, 9);

        valores.stream()
                .skip(2) // Pula 2 Valores do stream, e é uma operação intermediária
                .forEach(e -> System.out.println(e));

        System.out.println("############################");

        valores.stream()
                .limit(2) // Limita a stream para usar somente 2 valores
                .forEach(e -> System.out.println(e));

        System.out.println("############################");

        valores.stream()
                .distinct() // retorna somente os valores únicos
                .forEach(e -> System.out.println(e));

        System.out.println("############################");
        // Pode combinar vários!
        valores.stream()
                .distinct()
                .filter(e -> par(e)) // E o filter que retorna dependendo da condição
                .forEach(e -> System.out.println(e));

        System.out.println("############################");

        valores.stream()
                .map(e -> e + 1) // Altera cada valor da lista
                // Mas a lista original não é modificada
                .forEach(e -> System.out.println(e));
        
    }
}
