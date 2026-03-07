package davyusow.javacore.Threads;

public class DeadLock01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1) {
                IO.println(Thread.currentThread().getName() + ": Segurando lock1");
                IO.println(Thread.currentThread().getName() + ": Esperando lock2");
                synchronized (lock2) {
                    IO.println(Thread.currentThread().getName() + ": Segurando lock2");

                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                IO.println(Thread.currentThread().getName() + ": Segurando lock2");
                IO.println(Thread.currentThread().getName() + ": Esperando lock1");

                synchronized (lock1) {
                    IO.println(Thread.currentThread().getName() + ": Segurando lock1");

                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
