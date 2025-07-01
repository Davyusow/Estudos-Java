package javacore.colecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("E", " Letra E");
        map.put("A", " Letra A");
        map.put("D", " Letra D");
        map.put("C", " Letra C");
        map.put("B", " Letra B");
        //ordena pela chave
        for(Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        System.out.println(map.headMap("C")); //retorna todos abaixo de "C", antes de C
    }
}
