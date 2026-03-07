package davyusow.javacore.Threads;

import java.time.Duration;

// Daemon X User
// Threads daemon tem menos prioridades, e quando as threads do User encerram
// O programa em si encerra

class ExemploThread extends Thread { // beem low level
    private char letra;

    public ExemploThread(char letra) {
        this.letra = letra;
    }

    @Override
    public void run() {
        IO.print(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            IO.print(letra);
            if (i % 100 == 0) {
                IO.println();
            }
        }
    }
}

class ExemploRunnable implements Runnable {

    private char letra;

    public ExemploRunnable(char letra) {
        this.letra = letra;
    }

    @Override
    public void run() {
        IO.print(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            IO.print(letra);
            if (i % 100 == 0) {
                IO.println();
            }
            // Finalmente, uma forma de ver o código rodando em uma velocidade humanamente
            // perceptível!
            try {
                Thread.sleep(Duration.ofMillis(200)); // Faz a thread esperar um tempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class Threads01 {
    public static void main(String[] args) {
        // ExemploThread thrd1 = new ExemploThread('A');
        // ExemploThread thrd2 = new ExemploThread('B');
        // ExemploThread thrd3 = new ExemploThread('C');
        // ExemploThread thrd4 = new ExemploThread('D');

        // Single Thread
        // thrd1.run();
        // thrd2.run();
        // thrd3.run();
        // thrd4.run();

        // Multi Thread
        Thread t1 = new Thread(new ExemploRunnable('A'), "Thread - Letra A"); // mais feio, porém mais recomendado
        Thread t2 = new Thread(new ExemploRunnable('B'), "Thread - Letra B");
        Thread t3 = new Thread(new ExemploRunnable('C'), "Thread - Letra C");
        Thread t4 = new Thread(new ExemploRunnable('D'), "Thread - Letra D");

        t1.setPriority(5); // varia de acordo com a jdk
        t2.setPriority(Thread.MAX_PRIORITY); // Constante mais confiável
        // Não garante que será a primeira a ser executada

        t1.start();
        t2.start();
        t3.start();
        t4.start(); // Depois de dar start em uma thread, não chama ela denovo, senão lança ume
                    // exceção

    }
}
