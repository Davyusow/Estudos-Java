package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTeste01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta");
        zip(arquivoZip,arquivosParaZipar);
    }
    private static void zip(Path arquivoZip,Path arquivosParaZipar){
        try(ZipOutputStream zipStream =  new ZipOutputStream(Files.newOutputStream(arquivoZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar);
            for(Path arquivo: directoryStream){
                System.out.println(arquivo.getFileName());
                ZipEntry zipEntry = new ZipEntry(arquivo.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(arquivo, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
