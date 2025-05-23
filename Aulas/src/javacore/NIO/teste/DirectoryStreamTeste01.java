package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {
        Path caminho = Paths.get("Aulas");
        
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(caminho)) { //é um generics
            for(Path elemento : stream ) //para cada elemeto da stream
                System.out.println(elemento.getFileName()); //imprima o nome do arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}
