package javacore.NIO.teste;


import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListaArquivosJava extends SimpleFileVisitor<Path>{
    
    //@Override //imprime todo o log
    //public FileVisitResult visitFile(Path arquivo,BasicFileAttributes attributos){
    //   System.out.println(arquivo.getFileName());
    //    return FileVisitResult.CONTINUE;
    //}
    @Override
    public FileVisitResult visitFile(Path arquivo,BasicFileAttributes attributos){ //imprime arquivos.java
        String regex = "([\\w])+.java"; //apenas os arquivos.java
        String texto = arquivo.getFileName().toString();
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        if (matcher.find())
            System.out.println(matcher.group());

        return FileVisitResult.CONTINUE;
    }
    //é mais facil se usar arquivo.getFileName().toString().endWith(".java");
}

public class SimpleFileVisitorTeste01 {
    public static void main(String[] args) throws IOException {
        Path raiz = Paths.get(".");
        Files.walkFileTree(raiz, new ListaArquivosJava());
    }
}
