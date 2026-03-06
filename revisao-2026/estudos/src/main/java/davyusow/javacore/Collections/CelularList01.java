package davyusow.javacore.Collections;

import java.util.ArrayList;
import java.util.List;

import davyusow.javacore.Collections.model.Celular;

public class CelularList01 {
    public static void main(String[] args) {
        Celular c1 = new Celular("123", "Apple");
        Celular c2 = new Celular("456", "Google");
        Celular c3 = new Celular("789", "Samsung");

        List<Celular> celulares = new ArrayList<>(3);
        {
            celulares.add(c1);
            celulares.add(c2);
            celulares.add(c3);
        }

        Celular c4 = new Celular("456", "Google");

        celulares.forEach(IO::println);
        IO.println(celulares.contains(c4)); // Precisa de um equals implementado para usar este atributo
        Integer indice = celulares.indexOf(c4);
        IO.println("Índice [" + indice + "] " + celulares.get(indice));
    }
}
