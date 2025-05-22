package javacore.NIO.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFileAttributes (para windows), PosixFileAttributes (sistemas de unix)
        //permite polimorfismo de arquivos apartir do sistema operacional
        LocalDateTime data = LocalDateTime.now().minusDays(2);
        File arquivo = new File("Pasta2/novo.txt");

        boolean isCriado = arquivo.createNewFile();
        arquivo.setLastModified(data.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path caminho = Paths.get("Pasta2/novo_caminho.txt");
        if (Files.notExists(caminho))
            Files.createFile(caminho);
        FileTime  tempo = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(caminho,tempo);

        System.out.println(Files.isExecutable(caminho));
        System.out.println(Files.isHidden(caminho));
        System.out.println(Files.isReadable(caminho));
        System.out.println(Files.isWritable(caminho));
    }
}
