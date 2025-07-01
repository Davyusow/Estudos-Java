package javacore.generics.teste;

import javacore.generics.dominio.Barco;
import javacore.generics.dominio.Carro;
import javacore.generics.service.BarcoService;
import javacore.generics.service.CarroService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroService servicoCarros = new CarroService();
        Carro carro = servicoCarros.buscarDisponiveis();
        System.out.println("Usando o carro por 1 mês...");
        servicoCarros.retornarAlugado(carro);

        BarcoService servicoBarcos = new BarcoService();
        Barco barco = servicoBarcos.buscarDisponiveis();
        System.out.println("Usando o barco por 1 mês...");
        servicoBarcos.retornarAlugado(barco);
    }
}
