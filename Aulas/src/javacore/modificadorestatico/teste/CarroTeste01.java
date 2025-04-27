package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());

        Carro carro01 = new Carro("Kwid",270);
        Carro carro02 = new Carro("Ônix",360);
        Carro carro03 = new Carro("Polo",190);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
