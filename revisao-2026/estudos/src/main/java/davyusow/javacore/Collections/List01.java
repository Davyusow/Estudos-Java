package davyusow.javacore.Collections;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(2);
        nomes.add("Beltrano");
        nomes.add("Fulano");

        nomes.forEach(IO::println);
        IO.println(nomes);

        List<Integer> numeros = new ArrayList<>(10);
        
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        IO.println(numeros);

        // Remove

        nomes.remove("Beltrano"); // Pra passar um objeto, é necessário ele ter um equals
        IO.println(nomes);

        List<String> nomes2 = new ArrayList<>(3);
        nomes2.addAll(nomes);
        nomes2.add("Novo nome");
        nomes2.add("Mais um nome");
        IO.println(nomes2);

    }
}
