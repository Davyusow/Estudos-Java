package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListaArquivos extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path arquivo, BasicFileAttributes attributos) { // imprime arquivos.java
        System.out.println(arquivo.getFileName());
        return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult preVisitDirectory(Path diretorio, BasicFileAttributes attributos) throws IOException { 
        System.out.println("Pré visita: "+diretorio.getFileName());
        return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFileFailed(Path arquivo, IOException exc) throws IOException { 
        return super.visitFileFailed(arquivo,exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path arquivo, IOException exc) throws IOException { 
        System.out.println("Pós visita: "+arquivo.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTeste02 {
    public static void main(String[] args) throws IOException {
        Path raiz = Paths.get("pasta");
        Files.walkFileTree(raiz, new ListaArquivosJava());
    }
}
