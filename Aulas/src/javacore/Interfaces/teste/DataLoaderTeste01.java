package javacore.Interfaces.teste;

import javacore.Interfaces.dominio.DataBaseLoader;
import javacore.Interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        fileLoader.remove();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
