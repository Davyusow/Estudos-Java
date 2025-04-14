package Aula01;

public class Programa {
    public static void main(String[] args) {
        Conta contaPaulo = new Conta("1234",100.0);
        System.out.println(contaPaulo.getNumero());
        contaPaulo.setNumero("1111");
        System.out.println(contaPaulo.getNumero());
    }
}
