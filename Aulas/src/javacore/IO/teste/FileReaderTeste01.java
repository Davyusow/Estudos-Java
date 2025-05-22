package javacore.IO.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file)) {
            //System.out.println(fr.read()); //retorna o primeiro caractere do arquivo
            //char[] in = new char[30];
            //fr.read(in); //envia os valores para o array de char
            //for(char c:in){
            //    System.out.print(c); //imprime o texto e os caracteres não declarados
            //}
            int i = 0;
            while((i = fr.read()) != -1) { //enquanto a atribuição for verdadeira
                //fr.read retorna -1 quando chega no final do arquivo
                System.out.print((char)i); //imrpime todo o texto
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
