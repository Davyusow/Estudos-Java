package javacore.classesinternas.teste;

import javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTeste02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>();
        barcoList.add(new Barco("Canoa"));
        barcoList.add(new Barco("Kaiaki"));

        barcoList.sort(new Comparator<Barco>() {    //classe comparator anônima
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome())); //lambda

        barcoList.sort(Comparator.comparing(Barco::getNome)); //ainda mais otimizado, porém, não usar classes anônimas
        //programação opcional ~~~^
        System.out.println(barcoList);
    }
}
