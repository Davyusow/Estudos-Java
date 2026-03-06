package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributes02 {
    public static void main(String[] args) throws IOException {
        Path arquivoPath = Paths.get("assets/file.txt");

        // Permite acessar os atributos do arquivo
        BasicFileAttributes fileAttributes = Files.readAttributes(arquivoPath, BasicFileAttributes.class);

        IO.println("Criado: " + fileAttributes.creationTime()); // File times
        IO.println("Acessado: " + fileAttributes.lastAccessTime());
        IO.println("Modificado: " + fileAttributes.lastModifiedTime());

        BasicFileAttributeView fileAttributesView = Files.getFileAttributeView(arquivoPath,
                BasicFileAttributeView.class);

        fileAttributesView.setTimes(fileAttributes.lastModifiedTime(),
                FileTime.fromMillis(System.currentTimeMillis()), // Tempo atual do sistema operacional
                fileAttributes.creationTime());

        IO.println("Criado: " + fileAttributes.creationTime());
        IO.println("Acessado: " + fileAttributes.lastAccessTime());
        IO.println("Modificado: " + fileAttributes.lastModifiedTime());
    }
}
