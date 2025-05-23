package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("/home/davyusow/Projetos/Java/Estudos-Java/file.txt");
        PosixFileAttributes atributos = Files.readAttributes(caminho,PosixFileAttributes.class);
        System.out.println(atributos.permissions());

        PosixFileAttributeView verAtributos = Files.getFileAttributeView(caminho,PosixFileAttributeView.class);
        Set<PosixFilePermission> permissoes = PosixFilePermissions.fromString("rw-rw-rw-"); //rw significa ler e escrever
        //como estou passando isso 3 vezes, quer dizer que o dono(eu) outros e grupos podem ler e editar o arquivo
        //Inclusive esse Set<tipo> é uma coleção, mas será visto futuramente
        //PosixFilePermission e PosixFilePermission's' são duas classes diferentes
        verAtributos.setPermissions(permissoes);

        System.out.println(verAtributos.readAttributes().permissions());

    }
}
