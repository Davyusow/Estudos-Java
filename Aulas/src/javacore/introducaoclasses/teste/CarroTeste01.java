package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Kwid";
        carro01.ano = 2024;
        carro01.modelo = "HatchBack";

        Carro carro02 = new Carro();
        carro02.nome = "Impreza";
        carro02.ano = 2004;
        carro02.modelo = "Sport";
        //carro01 = carro02;
        System.out.printf("Nome: %s\nAno: %d\nModelo: %s\n",carro01.nome,carro01.ano,carro01.modelo);
        System.out.printf("Nome: %s\nAno: %d\nModelo: %s\n",carro02.nome,carro02.ano,carro02.modelo);
    }
}
