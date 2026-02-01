package java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StaticFactory {
    public static void main(String[] args) {
        var vazio = Optional.empty(); // mais vantagioso de conseguir uma configuração específica
        // aqui fica claro que queremos um Optional vazio

        // var cem = Optional.of(100);
        var nullable = Optional.ofNullable(null);

        var lista = new ArrayList<>();
        var listaImutavel = Collections.unmodifiableList(lista);

        // listaImutavel.add(2); //lança exceção

        Integer valor = Integer.valueOf(100);

        // list, set & map
        Integer cem = Integer.valueOf(100);
        var duzentos = Integer.valueOf(200);
        var trezentos = Integer.valueOf(300);

        // antes
        var lista2 = Arrays.asList(cem, duzentos, trezentos);

        // pós java9
        lista2 = List.of(cem, duzentos, trezentos);
        lista2.add(4); // lança exceção, é uma lista imutável.
        // Map.of()
        // Set.of() também existem
    }
}
