package javacore.heranca.teste;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco01 = new Endereco();
        endereco01.setRua("Esquina");
        endereco01.setCep("000000-000");

        Endereco endereco02 = new Endereco();
        endereco02.setRua("Logo ali");
        endereco02.setCep("111111-111");

        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Fulano de Tal");
        pessoa01.setCpf("123.123.123-12");
        pessoa01.setEndereco(endereco01);
        pessoa01.imprime();

        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Beltrano de lá");
        funcionario01.setCpf("345.345.345-34");
        funcionario01.setEndereco(endereco02);
        funcionario01.setSalario(1500.00);
        funcionario01.imprime();
    }
}
