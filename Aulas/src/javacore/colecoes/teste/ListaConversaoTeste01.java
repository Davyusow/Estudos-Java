package javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaConversaoTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        Integer[] listaParaArray = numeros.toArray(new Integer[0]); //colocando 0 o java atribui o tamanho automaticamente
        // mas, numeros.size() não seria uma abordagem errada, porém o desempenho com 0 é melhor
        System.out.println(Arrays.toString(listaParaArray));

        Integer[] arrayParaList = new Integer[3];
        arrayParaList[0] = 1;
        arrayParaList[1] = 3;
        arrayParaList[2] = 5;
        List<Integer> lista = Arrays.asList(arrayParaList);
    }
}
