package javacore.colecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //semelhante a dicionário do python
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.put("vc","Você"); //sobre escreve o valor da chave 'vc'
        map.putIfAbsent("vc","asdasdasdsad"); //adiciona apenas se já não existir
        System.out.println(map);
        for(String chave : map.keySet() ){
            System.out.println(chave); //imprime todas as chaves
        }
        for(String chave : map.keySet() ){
            System.out.println(chave + " : " + map.get(chave)); //imprime todas as chaves e seus valores
        }
        //apesar disso não tem uma forma simples de pegar a chave de um valor, já que podem ter valores iguais mas de chaves diferentes
        System.out.println("---------------------");
        for(Map.Entry<String,String> mapa : map.entrySet()){
            System.out.println(mapa.getKey() + " " + mapa.getValue());
        }
    }
}
