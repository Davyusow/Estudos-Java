package javacore.excecao.runtime.teste.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable { //O closable é necessário para usar o try with resources
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}
