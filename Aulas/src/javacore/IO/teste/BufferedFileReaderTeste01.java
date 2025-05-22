package javacore.IO.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
            //br.readLine();  //retorna a linha inteira
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
