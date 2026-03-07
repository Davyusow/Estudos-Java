package davyusow.javacore.Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NamesThreadSafe {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());
    // A lista é thread safe
    // Mas o método que usaremos aqui dentro provavelmente não será
    // Temos que manter thread safe quando usarmos
    // Caso o contrário em uma concorrência é ocorrida uma exceção

    public synchronized void add(String nome) {
        names.add(nome);
    }

    public synchronized void removeFirst() {
        if (names.size() > 0) {
            IO.println(Thread.currentThread().getName());
            IO.println(names.removeFirst());
        }
    }
}

public class ThreadSafe01 {
    public static void main(String[] args) {
        NamesThreadSafe nthread01 = new NamesThreadSafe();
        // NamesThreadSafe nthread02 = new NamesThreadSafe();
        nthread01.add("Fulana");

        // Runnable run = () -> {
        // nthread01.removeFirst();
        // };

        Runnable run = nthread01::removeFirst;

        new Thread(run).start();
        new Thread(run).start();

    }
}
