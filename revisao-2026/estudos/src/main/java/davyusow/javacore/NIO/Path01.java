package davyusow.javacore.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
O Nio é a nova forma do java de trabalhar com arquivos
sem se preocupar com as diferenças entre os sistemas operacionais.
Já que ele usa uma interface (PATH) para lidar com os arquivos.
Que é implementada pelo Paths, e pode ser operada pelo Files
*/
public class Path01 {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/davyusow/javacore/NIO/assets/file.txt");
        // transforma em um arquivo;
        path.toFile();
        IO.println(path.getFileName());

        // Além disso, o path suporta um var args para o nome do arquivo, por exemplo:
        
        Path root = Paths.get("src/main/java/davyusow/javacore/NIO");

        Path arquivo2 = Paths.get(root.toAbsolutePath().toString(), "arquivo2.txt");
        arquivo2.toFile();

    }
}
