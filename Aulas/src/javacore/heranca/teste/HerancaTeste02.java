package javacore.heranca.teste;

import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Jiraiya","8192357981297845");//primeiro é carregada a classe mãe e depois a classe filha
        Pessoa pessoa1 = new Funcionario();
        ((Funcionario)pessoa1).relatorioPagamento();
        Funcionario funcionario1 = new Funcionario();

        funcionario1.imprime();
    }
}
