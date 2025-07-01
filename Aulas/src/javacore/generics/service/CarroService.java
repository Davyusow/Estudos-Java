package javacore.generics.service;

import javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    private List<Carro> carros = new ArrayList<>(
            List.of(new Carro("BMW"), new Carro("AUDI")));

    public Carro buscarDisponiveis(){
        System.out.println("Buscando carro disponível...");
        Carro carro = carros.remove(0);
        System.out.println("Alugando carro: "+carro);
        System.out.println("Carrps disponíveis para alugar: ");
        System.out.println(carros);
        return carro;
    }

    public void retornarAlugado(Carro carro){
        System.out.println("Devolvendo carro: "+carro);
        carros.add(carro);
        System.out.println("Carrps disponíveis para alugar: ");
        System.out.println(carros);
    }
}
