package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divide(20,2));
        calculadora.imprimeDivisao(20,0);
    }
}
