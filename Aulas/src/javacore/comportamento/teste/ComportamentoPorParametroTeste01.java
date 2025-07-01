package javacore.comportamento.teste;

import javacore.comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {

    public static void main(String[] args) {
        List<Carro> carros = List.of(
                new Carro("Vermelho","2004"),
                new Carro("Branco","2024"),
                new Carro("Azul","2012")
        );

        System.out.println(filtraCarroBranco(carros));
        System.out.println(filtraCarroCor(carros,"Azul"));
    }

    private static List<Carro> filtraCarroBranco(List<Carro> carros){
        List<Carro> carrosBrancos = new ArrayList<>();

        for (Carro carro : carros) {
            if(carro.getCor().equals("Branco")){
                carrosBrancos.add(carro);
            }
        }
        return  carrosBrancos;
    }

    private static List<Carro> filtraCarroCor(List<Carro> carros,String cor){
        List<Carro> carrosPorCor = new ArrayList<>();

        for (Carro carro : carros) {
            if(carro.getCor().equals(cor)){
                carrosPorCor.add(carro);
            }
        }
        return  carrosPorCor;
    }

    private static List<Carro> filtraCarroAno(List<Carro> carros,String ano){
        List<Carro> carrosPorAno = new ArrayList<>();

        for (Carro carro : carros) {
            if(carro.getAno().equals(ano)){
                carrosPorAno.add(carro);
            }
        }
        return  carrosPorAno;
    }
}
