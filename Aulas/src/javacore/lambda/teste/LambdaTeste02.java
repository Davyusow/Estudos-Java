package javacore.lambda.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Alucard","Belmont","Somacruz");
        List<Integer> tamanhos = map(nomes, nome -> nome.length());
        List<String> maiusculo = map(nomes, nome -> nome.toUpperCase());

        System.out.println(tamanhos);
        System.out.println(maiusculo);

    }

    private static <T, R> List<R> map(List<T> lista, Function<T,R> funcao){
        List<R> resultado = new ArrayList<>();
        for(T elemento : lista){
            R r = funcao.apply(elemento);
            resultado.add(r);
        }
        return resultado;
    }
}
