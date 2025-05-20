package javacore.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo o que não é dígito
        // \s = espaços em branco, pode usar também \t \n \f \r
        // \S = todos os caracteres excluindo os espaços em branco
        // \w = letras de a-z ou A-Z, dígito e "_" underlines
        // \W = tudo ao contrário de \w
        // [] = tudo no alcance dado, exemplo [abc] ou a ou ou c, [a-zA-c] de 'a' a 'z' minúsculo, e de 'A' a 'C' maiúsculo
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n a m
        // () = agrupa ocorrências
        // | = ou um ou outro, exemplo = 'o(v|c)o' vai retornar se entre os dois 'ós' tiver 'v' ou 'c'
        // $ = representa o fim da linha
        // . = se tiver entre a ocorrência será considerado

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //válida números hexadecimais
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";    //texto a ser aplicado
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

