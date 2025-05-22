package javacore.IO.teste;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter escrita = new FileWriter(file)) {
            escrita.write("Linha no texto");    //insere a string no arquivo
            escrita.flush(); //envia tudo do buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
