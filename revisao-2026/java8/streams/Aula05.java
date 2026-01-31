package java8.streams;

import java.math.BigDecimal;
import java.util.Arrays;

public class Aula05 {
    public static void main(String[] args) {
        var lista = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);

        lista.stream().forEach(System.out::println); // method reference
        // úteis quando temos um único argumento
        // diminuindo ainda mais a escrita
        // Normalmente o código pode não começar assim
        // é mais comum ocorrer uma transição como essa:
        // literal -> lambda -> method reference

        // métodos estáticos

        lista.stream()
                .map(Aula05::mult2) // .map((n) -> mult2(n))
                .forEach(System.out::println);

        // construtores
        lista.stream()
                .map(BigDecimal::new) // n -> new BigDecimal(n)
                .forEach(System.out::println);

        // várias instâncias
        lista.stream()
                .map(Integer::doubleValue) // n -> n.doubleValue()
                .forEach(System.out::println);

        // única instância
        var DOIS = new BigDecimal(2);
        lista.stream()
                .map(BigDecimal::new)
                .map(DOIS::multiply) // b -> DOIS.multiply(b)
                .forEach(System.out::println);

    }

    private static Integer mult2(Integer valor) {
        return valor * 2;
    }
}
