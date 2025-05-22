package javacore.NIO.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        Path pasta =  Paths.get("pasta"); //ao colocar apenas o nome do arquivo, começa a procurar apartir da raíz do projeto
        
        if(Files.notExists(pasta)){ //válido para arquivos e diretórios
            //caso o diretório pai do arquivo não existir uma exceção é lançada
            Path pastaDiretorio = Files.createDirectory(pasta); //detalhe que a pasta "Files" é diferente da "File"
        }

        Path subpasta = Paths.get("pasta/subpasta/subpasta");
        if(Files.notExists(subpasta)){
            Path diretorioSubpasta = Files.createDirectories(subpasta); //cria pastas e subpastas que ainda não existem
        }
        

        Path arquivoPath = Paths.get(subpasta.toString(),"arquivo.txt");
        if(Files.notExists(arquivoPath)){
            Path arquivoPathCriado = Files.createFile(arquivoPath);
        }
        
        Path origem = arquivoPath; //arquivo que será manipulado
        Path destino = Paths.get(arquivoPath.getParent().toString(),"arquivo_renomeado.txt"); //define o caminho do destino como 'pasta/subpasta/subpasta/arquivo_renomeado.txt'
        //Files.copy(origem,destino,StandardCopyOption.REPLACE_EXISTING); //transfere os dados do arquivo original para o novo
        Files.copy(origem,destino); //copia o arquivo origem para o caminho destino
        //onde nesse caso também renomeou no final
        //semelhando ao comando 'mv' do bash

    }

}
