package javacore.comportamento.teste;

import javacore.comportamento.dominio.Carro;
import javacore.comportamento.interfaces.CarroParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste02 {

    public static void main(String[] args) {
        List<Carro> carros = List.of(
                new Carro("Vermelho","2004"),
                new Carro("Branco","2024"),
                new Carro("Azul","2012")
        );


        List<Carro> carrosFiltrados2 = filtra(carros,carro -> carro.getCor().equals("Azul") );
        //lambda, bem mais curto
        List<Carro> carrosFiltradosAno = filtra(carros,carro -> carro.getAno().equals("2004") );

        System.out.println(carros);
        System.out.println(carrosFiltrados2);
        System.out.println(carrosFiltradosAno);
    }
    private static List<Carro> filtra(List<Carro> carros, Predicate<Carro> carroParametro){
        List<Carro> carrosFiltrados = new ArrayList<>();
        for (Carro carro : carros) {
            if(carroParametro.test(carro)) {
                carrosFiltrados.add(carro);
            }
        }
        return  carrosFiltrados;
    }



}
