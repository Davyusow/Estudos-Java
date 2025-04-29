package Aula03;

public class ContaTeste01 {
    public static void main(String[] args) {
        Conta conta01 = new Conta("Pablão",200);
        conta01.creditar(100);
        Conta conta02 = new Conta("Marcão",100);
        conta02.creditar(200);
        System.out.println(conta01.getSaldo());
        conta01.tansferir(conta02,50);
        System.out.println(conta01.getSaldo());
        System.out.println(conta02.getSaldo());
        System.out.println(conta01.equals(conta02));
        System.out.println(conta01.toString());
        System.out.println(conta02.toString());
    }
}
