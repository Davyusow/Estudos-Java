package javacore.NIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/davyusow");
        Path clazz = Paths.get("/home/davyusow/Projetos/Java/Estudos-java/");
        Path relativo = dir.relativize(clazz); //retorna um Path relativo ao parâmetro
        System.out.println(relativo);
    }
}
