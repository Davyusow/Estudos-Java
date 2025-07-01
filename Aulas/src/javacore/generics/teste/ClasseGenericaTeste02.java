package javacore.generics.teste;

import javacore.generics.dominio.Barco;
import javacore.generics.dominio.Carro;
import javacore.generics.service.Servico;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("Audi"),new Carro("Maseratti")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Kaiaki")));

        Servico<Carro> servicoCarro = new Servico<>(carros);
        Carro carro = servicoCarro.buscarDisponiveis();
        servicoCarro.retornarAlugado(carro);

        Servico<Barco> servicoBarco = new Servico<>(barcos);
        Barco barco = servicoBarco.buscarDisponiveis();
        servicoBarco.retornarAlugado(barco);
    }
}
