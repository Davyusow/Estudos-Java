package davyusow.javacore.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path03 {
    public static void main(String[] args) {
        Path dirHomePath = Paths.get("/home/davyusow");
        
        //Queremos que o path do arquvo sera relativo ao home
        Path arquivoPath = Paths.get("Docummentos/arquivo.txt"); 

        // Resolve é o diretório home + o diretório do arquivo
        Path resolvePath = dirHomePath.resolve(arquivoPath);


        IO.println("Home: "+ dirHomePath.normalize());
        IO.println("Arquivo: "+ arquivoPath.normalize());
        IO.println("Path Absoluto: "+ resolvePath.normalize());
    }
}
