package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String... args) { //também é possível de usar o varArgs no public static void main
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);
    }
}
