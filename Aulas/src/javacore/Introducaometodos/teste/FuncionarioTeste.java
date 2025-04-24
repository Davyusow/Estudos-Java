package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        float[] salarios = {1600,1500,1450};
        Funcionario funcionario01 = new Funcionario("Fulano",29,salarios);
        funcionario01.imprimir();
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Ciclano");
        funcionario2.setIdade(28);
        funcionario2.setSalarios(new float[]{1200,987,2000});
    }
}
