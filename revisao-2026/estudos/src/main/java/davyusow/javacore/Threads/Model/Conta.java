package davyusow.javacore.Threads.Model;

public class Conta {
    private Integer saldo = 50;

    public Integer getSaldo() {
        return saldo;
    }

    public void saque(Integer quantia) {
        saldo -= quantia;
    }
}
