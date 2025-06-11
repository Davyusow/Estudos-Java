package javacore.colecoes.teste;

import javacore.colecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11123","Samsung");
        Smartphone s2 = new Smartphone("11123","Samsung");
        System.out.println(s1.equals(s2));
    }
}
