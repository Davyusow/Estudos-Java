package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo02 {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
            "Beltrano",
            "Ciclano",
            "Anderlaine",
            "Frederico",
            "Gabriel"
        );

        //Queremos apenas os que os nomes que comecem com 'A' ou 'B' Sejam retornados
        List<String> resultado = nomes
            .stream()
            .filter(nome -> nome.startsWith("A") || nome.startsWith("B")) //filtra
            .sorted() //ordena
            .collect(Collectors.toList()); //retorna uma lista

        Integer totalCaracteres = nomes.stream().mapToInt(String::length).sum();

        System.out.println("Nomes que começam com A: %s".formatted(resultado));

        System.out.println(
            "Total de caracteres de todos os nomes: %2d".formatted(
                totalCaracteres
            )
        );
    }
}
