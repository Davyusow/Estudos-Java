package davyusow.javacore.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stream04 {
    public static void main(String[] args) {
        List<List<String>> turma = new ArrayList<>();
        List<String> equipe = List.of("Beltrano", "Fulana", "Ciclano");
        List<String> desenvolvedores = List.of("timotio", "chalala", "dog", "sabão");
        List<String> alunos = List.of("valencio", "luana", "clara", "carlos");

        turma.add(equipe);
        turma.add(desenvolvedores);
        turma.add(alunos);

        turma.stream() // flatmap em vez de pegar a List<List<String>>, entra outro nível e pega o List<String>
                .flatMap(Collection::stream)
                .forEach(IO::println);

    }
}
