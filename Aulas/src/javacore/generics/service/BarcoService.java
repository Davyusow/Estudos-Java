package javacore.generics.service;

import javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoService {
    private List<Barco> barcos = new ArrayList<>(
            List.of(new Barco("BMW"), new Barco("AUDI")));

    public Barco buscarDisponiveis(){
        System.out.println("Buscando Barco disponível...");
        Barco barco = barcos.remove(0);
        System.out.println("Alugando Barco: "+barco);
        System.out.println("Carrps disponíveis para alugar: ");
        System.out.println(barcos);
        return barco;
    }

    public void retornarAlugado(Barco barco){
        System.out.println("Devolvendo Barco: "+barco);
        barcos.add(barco);
        System.out.println("Carrps disponíveis para alugar: ");
        System.out.println(barcos);
    }
}
