package javacore.IO.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class FileTeste01 {
    public static void main(String[] args) {
        File file1 = new File("arquivo1.txt"); //cria uma instância do arquivo no diretório inserido
        //podendo passar relativo ao root do sistema, do projeto ou na pasta atual
        //no terceiro caso é necessário apenas o nome
        try {
            boolean isCriado = file1.createNewFile();
            System.out.println(isCriado); //criado na pasta root do projeto
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //if (file1.exists() ) {
        //    boolean isDeletado = file1.delete(); //deleta o arquivo
        //}

        System.out.println("Caminho = "+file1.getPath());   //caminho relativo à raíz do projeto
        System.out.println("Caminho = "+file1.getAbsolutePath());   //caminho absoluto em relação à raíz do sistema
        System.out.println("É um diretório? = "+file1.isDirectory());  //verifica se é um diretório
        System.out.println("É um arquivo? = "+file1.isFile());  //verifica se é um arquivo
        System.out.println("É um arquivo oculto? = "+file1.isHidden());  //verifica se é um arquivo oculto
        System.out.println("Última modificação = "+ Instant.ofEpochSecond(file1.lastModified()));  //verifica se é um arquivo
    }
}
