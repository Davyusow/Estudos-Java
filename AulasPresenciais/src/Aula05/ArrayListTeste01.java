package Aula05;

import java.util.ArrayList;

public class ArrayListTeste01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Pedro");
        System.out.println(nomes);
        System.out.println(nomes.get(0));
        nomes.remove("Pedro");
        System.out.println(nomes);
        nomes.add("Alan");
        nomes.add("Antônio");
        for(String nome:nomes){

            System.out.println(nome);
        }
    }
}
