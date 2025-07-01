package javacore.generics.service;

import javacore.generics.dominio.Carro;
import java.util.List;

public class Servico<T> {
    private List<T> objetos;

    public Servico(List<T> objetos){
        this.objetos = objetos;
    }

    public T buscarDisponiveis(){
        System.out.println("Buscando objeto disponível...");
        T objeto = objetos.remove(0);
        System.out.println("Alugando carro: "+ objeto);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetos);
        return objeto;
    }

    public void retornarAlugado(T objeto){
        System.out.println("Devolvendo objeto: "+objeto);
        objetos.add(objeto);
        System.out.println("objetos disponíveis para alugar: ");
        System.out.println(objetos);
    }
}
