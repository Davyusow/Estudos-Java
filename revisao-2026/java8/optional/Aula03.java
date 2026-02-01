package java8.optional;

import java.util.Optional;

public class Aula03 {

    public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            Integer resultado = Integer.valueOf(numeroStr);
            return Optional.of(resultado);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        String s = "10";
        var numero = converteEmNumero(s);
        numero.ifPresent(System.out::println); // Só esxecuta, se tiver um valor dentro do optional
        System.out.println(numero.orElse(0)); // Imprime o número, senão imprime um valor padrão
        System.out.println(numero.orElseGet(() -> 0)); // O mesmo do else, mas com um lambda

        System.out.println(
            numero.orElseThrow(() -> new NullPointerException("Valor vazio!"))
        );
        // Se o valor não estiver, lança uma exceção!

        Integer i1 = Integer.valueOf(1);
    }
}
