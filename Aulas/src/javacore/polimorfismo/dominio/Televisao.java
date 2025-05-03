package javacore.polimorfismo.dominio;

public class Televisao extends Produto {
    public static double IMPOSTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return valor * IMPOSTO;
    }
}
