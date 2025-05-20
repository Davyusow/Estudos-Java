package javacore.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo o que não é dígito
        // \s = espaços em branco, pode usar também \t \n \f \r
        // \S = todos os caracteres excluindo os espaços em branco
        // \w = letras de a-z ou A-Z, dígito e "_" underlines
        // \W tudo ao contrário de \w
        String regex = "\\s"; //padrão a ser usado
        String texto = "213 hg  12l    j3 hv";    //texto a ser aplicado
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

