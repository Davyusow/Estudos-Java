package javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(0);
        lista.add(4);
        lista.add(3);
        //para usar a busca binária, a lista precisa estar ordenada
        Collections.sort(lista);
        System.out.println(Collections.binarySearch(lista, 4)); //retorna o índice da chave se estiver na lista
    }
}
