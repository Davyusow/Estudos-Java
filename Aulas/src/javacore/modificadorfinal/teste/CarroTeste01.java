package javacore.modificadorfinal.teste;


import javacore.modificadorfinal.dominio.Carro;
import javacore.modificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        System.out.println(Carro.getVelocidadeLimite());
        carro01.COMPRADOR.setNome("Kuririn");   //por COMPRADOR ser um tipo de referência
        //mesmo com um modificador final ainda é possível alterar os dados
        //somente não é possível fazer referência a outro objeto
        //isso se chama "singleton pattern"
        System.out.println(carro01.COMPRADOR.getNome());
    }
}
