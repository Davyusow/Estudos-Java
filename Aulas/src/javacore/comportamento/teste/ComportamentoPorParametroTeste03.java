package javacore.comportamento.teste;

import javacore.comportamento.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {

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

        List<Integer> nums = List.of(1,2,43,123,6,2,67,123,431);
        System.out.println(filtra(nums,num -> num % 2 == 0));
    }
    private static <T> List<T> filtra(List<T> objetos, Predicate<T> parametro){ //filtra objetos mais genéricos
        List<T> objetosFiltrados = new ArrayList<>();
        for (T objeto : objetos) {
            if(parametro.test(objeto)) {
                objetosFiltrados.add(objeto);
            }
        }
        return  objetosFiltrados;
    }



}
