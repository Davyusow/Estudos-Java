package javacore.excecao.runtime.teste.dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, IOException { //IOExcepion é uma exceção mãe de FileNotFoundException
        System.out.println("Salvando Pessoa");

    }
}
