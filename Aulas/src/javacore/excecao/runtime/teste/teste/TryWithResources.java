package javacore.excecao.runtime.teste.teste;

import javacore.excecao.runtime.teste.dominio.Leitor1;
import javacore.excecao.runtime.teste.dominio.Leitor2;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        //lerArquivo1();
        //lerArquivo2();
        lerArquivo3();
    }

    public static void lerArquivo1(){ //Horrível
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void lerArquivo2(){    //try with resources (bonito)
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){   //toma conta de fechar o recurso, se implementar a interface Closable ou autoClosable

        }catch (IOException e){ //o catch não fica necessário, porém será necessário usar o throws na classe

        }
    }

    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }


}
