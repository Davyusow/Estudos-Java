package javacore.generics.teste;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        List<Animal> animals = new ArrayList<>();
        printConsulta(cachorros);
        printConsulta(gatos);

        printConsultaAnimal(animals);
        printConsultaAnimal(cachorros);
//        printConsultaAnimal(gatos); gato não é uma classe pai de cachorro
    }
    //type erasure
    //aqui aceita animal ou seus filhos (classes extendidas)
    private static void printConsulta(List<? extends Animal> animals){
        //quando isso é feito não é possível adicionar mais elementos na lista dentro deste método
        //aceita apenas classes extendidas, e não interfaces
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    //aqui aceita animal, ou qualquer classe pai
    private static void printConsultaAnimal(List<? super Cachorro> animals){
        for(Object o : animals){
            System.out.println(o);
        }
    }
}
