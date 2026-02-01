package java10;

import java.util.List;
import java.util.Scanner;

public class OsVars {
    public static void main(String[] args) {

    }

    private static void pode() {
        // é útil para inicializar variáveis com tipos mais compridos ou lists e maps
        // muito espaçosas

        va r i = 52;
        var texto = "Um texto beeem grandinho";
        System.out.println("Tem texto?: " + texto.contains("texto"));

        var s = new Scanner(texto);

        var lista = List.of("Beltrano", "Fulano", "Ciclano");
        for (var elemento : lista) { // aqui ainda é melhor explicitar o tipo
            System.out.println(elemento);
        }

        for (var j = 0; j < 10; j++) { // a aqui não faz tanto diferença entre int e var
            i++;
        }

        var stringOuInteger = 1 == 1 ? "ABC" : 23; // intersectionType
        System.out.println(stringOuInteger);
    }

    private static void naoPode(String nome) { // não pode usar var nos parâmetros da função
        // não pode usar como um retorno

        // var i = null;
        Runnable r = () -> System.out.println("Rodando!");
        // var l = () -> System.out.println("Rodando!"); // não vai, precisa declarar o
        // Runnable
        // não pode usar em construtores
        // não pode usar como um atributo da classe
        // não pode usar no catch do try catch
    }
}
