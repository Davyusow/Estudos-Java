package javacore.colecoes.teste;

import javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class EqualsTeste02 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11123","Samsung");
        Smartphone s2 = new Smartphone("00000","Iphone");
        Smartphone s3 = new Smartphone("09123","Pixel");
        List<Smartphone> celulares = new ArrayList<>(6); //o Parâmetro do ArrayList indica o tamanho inicial do array
        celulares.add(s1);
        celulares.add(s2);
        celulares.add(s3);

        for(Smartphone celular: celulares){
            System.out.println(celular);
        }

        Smartphone s4 = new Smartphone("09123","Pixel");

        System.out.println("já existe o Google pixel na lista?"+celulares.contains(s4));
        int index = celulares.indexOf(s4); //retorna o índice do objeto da lista
        celulares.add(0, s4); //adiciona o valor em um índice específico
        System.out.println(celulares.get(index)); //retorna o objeto no índice na lista
        celulares.clear(); //limpa todo o array list
    }
}
