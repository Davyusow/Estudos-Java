package davyusow.javacore.Threads.service;

import java.time.Duration;

import davyusow.javacore.Threads.Model.Membros;

public class EnvioEmailsService implements Runnable {

    private final Membros membros;

    public EnvioEmailsService(Membros membros) {
        this.membros = membros;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        IO.println(threadName + ": Iniciando serviço de deliverys de e-mails...");
        while (membros.isAberto() || membros.emailsPendentes() > 0) {
            try {
                String email = membros.retornarEmail();
                if (email == null)
                    continue;
                IO.println(threadName + ": enviando e-mail para " + email);
                Thread.sleep(Duration.ofSeconds(2));
                IO.println(threadName + ": enviou e-mail com sucesso para " + email);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        IO.println("Todos os e-mails enviados com sucesso!");
    }

}