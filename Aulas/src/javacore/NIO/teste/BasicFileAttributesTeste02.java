package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTeste02 {
    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("Pasta2/novo_caminho.txt");
        BasicFileAttributes atributos = Files.readAttributes(caminho,BasicFileAttributes.class ); //pega os atributos do arquivo baseados no sistema operacional
        
        System.out.println(atributos.creationTime());
        System.out.println(atributos.lastAccessTime());
        System.out.println(atributos.lastModifiedTime());

        FileTime tempoAtributoCriacao = atributos.creationTime(); 
        FileTime tempoAtributoAcesso = atributos.lastAccessTime(); 
        FileTime tempoAtributoModificacao = atributos.lastModifiedTime(); 

        BasicFileAttributeView atributosVisualizacao = Files.getFileAttributeView(caminho,BasicFileAttributeView.class); //pega os atributos de visualização do arquivo baseados no sistema operacional

        //System.out.println(atributosVisualizacao.setTimes(tempoAtributoModificacao,tempoAtributoModificacao, tempoAtributoCriacao);
        //ok eu admito mó preguiça
    }
}
