package javacore.assiociacao.teste;

import javacore.assiociacao.dominio.Aluno;
import javacore.assiociacao.dominio.Professor;
import javacore.assiociacao.dominio.Seminario;

public class LeituraDoTeclado02Ex02 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Ciclano",20);
        Aluno aluno02 = new Aluno("Beltrano",18);
        Aluno aluno03 = new Aluno("Messi",33);
        Aluno aluno04 = new Aluno("Robô",45);
        Aluno aluno05 = new Aluno("Pepperoni",25);
        Aluno aluno06 = new Aluno("Mario irmãos",50);

        Seminario seminario01 = new Seminario("Briófitas",new Aluno[]{aluno02,aluno01},"Arruda");
        Seminario seminario02 = new Seminario("Reptilianos existem e podemos provar",new Aluno[]{aluno03,aluno04},"Ibura");
        Seminario seminario03 = new Seminario("Como as girafas serão a próxima espécie super inteligente da terra (após os golfinhos)",new Aluno[]{aluno05,aluno06},"Jaboatão");

        Professor professor01 = new Professor("Fulano da Silva","Biologia",new Seminario[]{seminario01,seminario02});
        Professor professor02 = new Professor("Júlio César","História 2",new Seminario[]{seminario03,seminario01});
        professor01.imprime();
        professor02.imprime();

    }
}
