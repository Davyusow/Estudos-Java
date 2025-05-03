package javacore.excecao.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo(){
        File file = new File("Arquivos/arquivo.txt");
        try{    //temte fazer este código
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+isCriado);
        }catch (IOException e){ //se pegar IOException, faz o tratamento e continua o código sem parar o programa
            //evitar colocar regra de negócio no catch
            e.printStackTrace();//imprime a exceção
        }
    }
}
