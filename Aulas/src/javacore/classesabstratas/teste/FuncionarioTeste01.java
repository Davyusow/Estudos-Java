package javacore.classesabstratas.teste;


import javacore.classesabstratas.dominio.Desenvolvedor;
import javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //Funcionario funcionario01 = new Funcionario("Zoro",2000); uma classe abstrata não pode ser instânciada
        Gerente gerente01 = new Gerente("Nami",5000);
        //System.out.println(funcionario01);
        System.out.println(gerente01);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Fulano de tal",9000);
        System.out.println(desenvolvedor01);
        gerente01.imprime();
        desenvolvedor01.imprime();
    }
}
