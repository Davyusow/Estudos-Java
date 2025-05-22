package javacore.IO.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter escrita = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(escrita)) { //também é colocado aqui para tirar proveito do try with resources
            //A classe BufferedWriter usa a classe FileWriter de forma mais otimizada
            bw.write("Linha no texto");    //insere a string no arquivo
            bw.newLine(); //pula linha dependendo do sistema operacional
            bw.flush(); //envia tudo do buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
