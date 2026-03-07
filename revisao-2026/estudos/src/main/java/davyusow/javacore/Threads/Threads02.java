package davyusow.javacore.Threads;

class ExemploRunnable2 implements Runnable {

    private String letra;

    public ExemploRunnable2(String letra) {
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
            Thread.yield();
        }

    }

}

public class Threads02 {
    public static void main(String[] args) throws InterruptedException {

        // Declara Implicitamente uma classe, com runnable e ainda já inicia a Thread
        new Thread(() -> {
            IO.println(Thread.currentThread().getName());
        }).start();

        // Declara o runnable externamente e depois insere na Thread
        Runnable t02 = () -> {
            IO.println(Thread.currentThread().getName());
        };
        new Thread(t02).start();

        Thread t1 = new Thread(new ExemploRunnable2("KA"));
        Thread t2 = new Thread(new ExemploRunnable2("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();  // Faz com que o main só prossiga assim que a thread t1 terminar

        t2.start();

    }
}
