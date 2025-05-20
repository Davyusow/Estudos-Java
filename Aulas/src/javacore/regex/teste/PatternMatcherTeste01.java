package javacore.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "ab"; //padrão a ser usado
        String texto = "abaaba";    //texto a ser aplicado
        Pattern padrao = Pattern.compile(regex);    //cria o padrão
        Matcher matcher = padrao.matcher(texto);    //cria o matcher que
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  "+regex);
        while (matcher.find()){ //enquanto o matcher encontrar o padrão
            System.out.println(matcher.start()+" "+matcher.group()); //retorna onde o padrão começou, e qual grupo foi encontrado
        }
    }
}

