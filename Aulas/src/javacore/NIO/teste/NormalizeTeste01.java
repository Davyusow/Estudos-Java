package javacore.NIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/davyusow/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path caminho = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(caminho); //imprime o caminho não normalizado
        System.out.println(caminho.normalize()); //imprime o caminho normalizado

        Path caminho2 = Paths.get("home/./davyusow/./dev");
        System.out.println(caminho2.normalize());
    }
}
