package javacore.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List nomes = new ArrayList();
        nomes.add("Joao");
        nomes.add("Fulano");

        for(Object nome : nomes){   //não é especificado o tipo
            System.out.println(nome);
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Joao");
        nomes2.add("Fulano");

        for(String nome : nomes2){
            System.out.println(nome);
        }
        for(int i = 0;i < nomes2.size();i++)
            System.out.println(nomes2.get(i));

    }
}
