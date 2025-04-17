package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Estudante;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
    }
}
