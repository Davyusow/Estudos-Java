package davyusow.javacore.Threads.Model;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean aberto = true;

    public boolean isAberto() {
        return this.aberto;
    }

    public synchronized int emailsPendentes() {
        return emails.size();
    }

    public void addEmailDeMembro(String email) {
        synchronized (this.emails){
            IO.println(Thread.currentThread().getName() + ": Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll(); // notifica as threads pausadas
        }
    }

    public String retornarEmail() throws InterruptedException {
        IO.println(Thread.currentThread().getName() + ": Checando se há novos e-mails...");
        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!isAberto())
                    return null;

                IO.println(Thread.currentThread().getName() + ": Sem e-mails na lista");
                IO.println("Ficando ocioso...");
                this.emails.wait(); // Tem que lockar com o syncronized, no método ou em bloco
            }
            return this.emails.poll();
        }
    }

    public void fechar() {
        this.aberto = false;
        synchronized (this.emails) {
            IO.println(Thread.currentThread().getName() + ": Não estamos mais verificando e-mails..");
        }
    }
}
