package javacore.Introducaometodos.teste;

import javacore.Introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano");
        pessoa.setIdade(29);
        pessoa.imprime();

    }
}
