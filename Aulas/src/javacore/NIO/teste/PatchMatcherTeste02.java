package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listaArquivosTesteJava extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    //funciona como o regex
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PatchMatcherTeste02 {
    public static void main(String[] args) throws IOException{
        Path raiz = Paths.get(".");
        Files.walkFileTree(raiz,new listaArquivosTesteJava());
    }
}
