package javacore.serializacao.teste;

import javacore.serializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTeste01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(123123,"Fulano","123");
        // serializar(aluno01);
        deSerializar();
    }

    private static void serializar(Aluno aluno){
        Path caminho = Paths.get("Aluno.ser");  //caminho para salvar o arquivo
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(caminho))){ //try with resources
            oos.writeObject(aluno); //escreve um arquivo em código de máquina
            //é recomendado chamar a classe no main antes de deserializar
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deSerializar(){
        Path caminho = Paths.get("Aluno.ser");  //caminho para salvar o arquivo
        try(ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(caminho))){ //try with resources
            Aluno aluno = (Aluno) oos.readObject(); //o cast esta sendo feito por ter certeza
            //de saber qual classe esta sendo lida
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
