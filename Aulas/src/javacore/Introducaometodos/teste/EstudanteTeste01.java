package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Estudante;
import javacore.Introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        //impressora.imprime(estudante01);
        //impressora.imprime(estudante02);
        estudante01.imprime();
        estudante02.imprime();

    }
}
