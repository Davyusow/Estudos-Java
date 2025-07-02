package javacore.lambda.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Fulano","Ciclano","Beltrano");
        List<Integer> numeros = List.of(1,3,5);

        forEach(nomes,nome -> System.out.println(nome));
        forEach(numeros,numero -> System.out.println(numero));
    }
    private static <T> void forEach(List<T> lista, Consumer<T> consumer){   //consumer é usado para métodos sem retorno
        for(T elemento : lista){
            consumer.accept(elemento);
        }
    }
}
