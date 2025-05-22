package javacore.IO.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args)  {
        File fileDiretorio = new File("Pasta");
        
        boolean isDiretorioCriado = fileDiretorio.mkdir(); //cria um diretório
        System.out.println("Diretório Criado: "+isDiretorioCriado);

        //File arquivo = new File("Pasta/arquivo.txt"); //funciona no Linux
        //File arquivo = new File("Pasta\\arquivo.txt"); //funciona no Windows
        File arquivo = new File(fileDiretorio,"arquivo"); //funciona em qualquer sistema operacional


        try{
            boolean isArquivoCriado = arquivo.createNewFile();
            System.out.println("Arquivo criado: "+isArquivoCriado);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        
        //File arquivoRenomeado = new File("arquivo_renomeado.txt");
        //boolean isRenomeado =  arquivo.renameTo(arquivoRenomeado); //ao renomear apenas o nome do arquivo, ele irá também alterar o endereço dele
        //System.out.println(isRenomeado);

        File arquivoRenomeado = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenomeado =  arquivo.renameTo(arquivoRenomeado); //ao renomear apenas o nome do arquivo, ele irá também alterar o endereço dele
        System.out.println(isRenomeado);
        
        File diretorioRenomeado = new File("Pasta_renomeada");
        isRenomeado = fileDiretorio.renameTo(diretorioRenomeado);
        System.out.println(isRenomeado);

    }
}
