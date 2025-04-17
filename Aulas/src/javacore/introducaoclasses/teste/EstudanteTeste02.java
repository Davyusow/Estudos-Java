package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        estudante.idade = 20;
        System.out.println(estudante.idade);
        estudante.sexo = 'M';
        System.out.println(estudante.sexo);

        Estudante estudante02 = new Estudante();
        System.out.println("\n"+estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
