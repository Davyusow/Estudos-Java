package javacore.classesinternas.teste;

import javacore.assiociacao.dominio.Local;

public class ClassesExternasTeste02 {

    private String nome = "Ciclano";

    void print(){
        String ultimoNome = "de Tal"; //sempre é final quando não é alterada
        class ClasseLocal { //é possível utilizar, mas não é muito usado
            public void printLocal(){
                System.out.println(nome + ultimoNome);
            }

        }
        new ClasseLocal().printLocal();
    }

    public static void main(String[] args) {
        ClassesExternasTeste02 externa = new ClassesExternasTeste02();
        externa.print();

    }
}
