package davyusow.javacore.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda01 {
    private static final Integer MAX = 10;

    public static void main(String[] args) {

        var lista = new ArrayList<Integer>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        imprimeLista(lista);
    }

    private static <T> void imprimeLista(List<T> lista) {
        lista.forEach(IO::println);
    }
}
