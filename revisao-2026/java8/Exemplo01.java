package java8;

import java.util.Arrays;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args) {
        List<String> turma = Arrays.asList("Beltrano", "Ciclano", "Ademar");
        turma.forEach(nome -> System.out.println(nome)); // Faz uma "ação" a cada iteração, no caso uma lambda
        //que chama cada elemento da lista de nome, e imprime cada um
        //Como é algo simples para precisar de uma função, e só foi usado aqui, uma lambda já basta

        Runnable r = () -> System.out.println("Thread Iniciada!");
        new Thread(r).start();
    }
}
