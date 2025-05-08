package javacore.excecao.runtime.teste.teste;

import javacore.excecao.runtime.teste.dominio.Funcionario;
import javacore.excecao.runtime.teste.dominio.LoginInvalidoException;
import javacore.excecao.runtime.teste.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
