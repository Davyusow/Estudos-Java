package javacore.polimorfismo.teste;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.repositorio.RepositorioArquivo;
import javacore.polimorfismo.repositorio.RepositorioBancoDeDados;
import javacore.polimorfismo.repositorio.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();   //indenpendente de ser memória, arquivo ou objeto, o código vai continuar funcionando
        //facilitando implementações
    }
}
