package javacore.Introducaometodos.teste;
import javacore.Introducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        calculadora.subtrai();
        calculadora.multiplica(10,4); // CTRL + P mostra os parâmetros dos métodos

    }
}
