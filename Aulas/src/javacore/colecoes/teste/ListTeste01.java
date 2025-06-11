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

        List<String> nomes2 = new ArrayList<>();//especifica o tipo
        //porém, o tipo precisa ser um Objeto, caso queira um List de tipo primitivo use um wrapper
        //Ex:Integer, Double, String, etc...
        nomes2.add("Joao");
        nomes2.add("Fulano");

        for(String nome : nomes2){
            System.out.println(nome);
        }
        for(int i = 0;i < nomes2.size();i++) { //caso faça uma atribuição durante um for com uma list
            //é recomendado que antes armazene o tamanho da lista em outra variável fixa,
            //pois uma lista altera seu tamanho dinâmicamente.
            System.out.println(nomes2.get(i));
        }
        nomes2.remove(1); //o método é sobrecarregado e permite a exclusão via o índice ou objeto
        //no caso como é uma String, é possível passar diretamente o conteúdo
        nomes.remove("Joao");
        System.out.println(nomes.remove("Joao")); //Retorna true, ou false dependendo se a exclusão foi bem sucedida
        nomes.addAll(nomes2); //adiciona todos os valores de outra lista
    }
}
