package davyusow.javacore.Threads;

import davyusow.javacore.Threads.Model.Conta;

public class ThreadConta01 implements Runnable {
    Conta conta = new Conta();

    public static void main(String[] args) {
        ThreadConta01 threadConta = new ThreadConta01();
        Thread thread01 = new Thread(threadConta, "Beltrana");
        Thread thread02 = new Thread(threadConta, "Fulana");

        // Concorrência
        // É difícil prever o que acontece quando essa condição esta ativa
        // É impossível ter um valor menor que 0 nessa classe mas a concorrência pode
        // permitir uma brecha que isso ocorre
        thread01.start();
        thread02.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                IO.println("It's over viu");
            }
        }
    }

    // synchronized, diz que somente uma thread por vez pode acessar este método
    // Evitando concorrência neste método
    private void saque(Integer valor) {
        synchronized (conta) { // Pode ser um bloco de código ou uma tag do método
            if (valor <= conta.getSaldo()) {
                IO.println(Thread.currentThread().getName() + "Esta sacando o dinheiro");
                conta.saque(valor);
                IO.println(Thread.currentThread().getName() + "Completou o saque: R$" + conta.getSaldo());
            } else {
                IO.println("Sem dinheiro para a " + Thread.currentThread().getName() + " Saldo: " + conta.getSaldo());
            }
        }
    }

}
