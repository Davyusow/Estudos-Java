package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calculadora.alteraDoisNumeros(n1,n2);
        System.out.println("Fora do altera dois números: \n"+n1);
        System.out.println(n2);
    }
}
