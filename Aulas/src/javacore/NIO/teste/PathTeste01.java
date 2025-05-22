package javacore.NIO.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("file.txt"); //Path é uma interface,  e Paths é uma classe utilitária para se trabalhar com arquivos
        Path p2 = Paths.get("/home/davyusow/Projetos/Java/Estudos-Java/","file.txt"); //caminho completo + nome do arquivo
        Path p3 = Paths.get("/home","/davyusow,","/Projetos","/Java,","/Estudos-Java/","file.txt");  //pasta por pasta
        //no caso do Windows é possível especificar a particão, por exemplo o disco C:

        System.out.println(p1.getFileName());
        System.out.println(p1.getFileName());
        System.out.println(p1.getFileName());

    }
}
