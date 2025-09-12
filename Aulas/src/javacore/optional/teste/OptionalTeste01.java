package javacore.optional.teste;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {

        Optional<String> objeto1 = Optional.of("Nome");
        Optional<String> objeto2 = Optional.ofNullable(null);
        Optional<String> objeto3 = Optional.empty();
        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto3);

        /*O optional serve para você conseguir administrar o dado independente do retorno
        * neste caso o dado retornado foi nulo, numa situação onde não pudessemos alterar a função que retornou null
        * usamos o Optional para mesmo que o dado seja nulo, o NullPointer Exception seja evitado*/

        /*
        O optional não é indicado na passagem de parâmetros, mas pode ser usado como retorno de uma função
         */

        Optional<String> nomeOptional = Optional.ofNullable(encontrarNome("Maria"));
        System.out.println(nomeOptional.orElse("Nome não encontrado!").toUpperCase());
        nomeOptional.ifPresent(s -> System.out.println(s.toUpperCase())); //outra forma com consumer e lambda
    }
    private static String encontrarNome(String nome){
        List<String> list = List.of("Fulano","Beltrano","Ciclano");
        int i = list.indexOf(nome);
        if(i > 0){
            return list.get(i);
        }
        return null;
    }
}
