package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("pasta/teste.txt");
        if (Files.notExists(caminho))
            Files.createFile(caminho);
        Files.setAttribute(caminho,"dos:hidden",true);
        Files.setAttribute(caminho,"dos:readonly",true);

        DosFileAttributes atributosDOS = Files.readAttributes(caminho,DosFileAttributes.class);

        System.out.println(atributosDOS.isHidden());
        System.out.println(atributosDOS.isReadOnly());

        DosFileAttributeView verAtributos = Files.getFileAttributeView(caminho,DosFileAttributeView.class);
        verAtributos.setHidden(true);
        verAtributos.setHidden(true);

        System.out.println(atributosDOS.isHidden());
        System.out.println(atributosDOS.isReadOnly());

        System.out.println(verAtributos.readAttributes().isReadOnly());
        System.out.println(verAtributos.readAttributes().isHidden());
    }
}
