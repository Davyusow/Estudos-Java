package javacore.lambda.teste;

import javacore.lambda.dominio.Anime;
import javacore.lambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTeste03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Fulano","Ciclano","Beltrano"));
        nomes.sort(String::compareTo);
        //compareTo não é estático, mas é possível chamar pelo nome da classe
        System.out.println(nomes);
        Function<String,Integer> stringParaNumero = Integer::parseInt;
        System.out.println(stringParaNumero.apply("10"));

        BiPredicate<List<String>,String> procuraNome = List::contains;
        System.out.println(procuraNome.test(nomes,"Fulano"));
    }
}
