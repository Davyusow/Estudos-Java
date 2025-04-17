package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.printf("O professor %s tem %d anos e é do sexo %c",professor.nome,professor.idade,professor.sexo);
    }
}
