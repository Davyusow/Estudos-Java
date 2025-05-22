package javacore.NIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/davyusow");
        Path arquivo = Paths.get("dev/arquivo");
        Path resultadoPath = dir.resolve(arquivo); //mescla um diretório com outro
        System.out.println(resultadoPath);

        Path absoluto = Paths.get("/home/davyusow");
        Path relativo = Paths.get("dev");
        
        Path file =  Paths.get("file.txt");
        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(absoluto));
        System.out.println("4 "+relativo.resolve(file));

    }
}
