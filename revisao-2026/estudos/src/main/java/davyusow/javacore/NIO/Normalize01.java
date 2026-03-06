package davyusow.javacore.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize01 {
    public static void main(String[] args) {
        Path diretorioPath = Paths.get("/home/davyusow/Documentos/Algoritmos");
        Path arquivoPath = Paths.get(diretorioPath.toString(), "/../../arquivo.txt");

        IO.println("Sem normalize: " + arquivoPath);
        // Irá simplesmente deixar a url do diretório formatado
        IO.println("Com normalize: " + arquivoPath.normalize());
    }
}
