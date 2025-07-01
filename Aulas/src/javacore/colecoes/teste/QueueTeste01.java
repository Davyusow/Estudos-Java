package javacore.colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 { //filas
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>(); //o tipo da fila precisa ter comparable
        //feita para trabalhar com prioridades customizadas
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String s : fila) {
            System.out.println(s);
        }
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);
        fila.offer("A");
        System.out.println(fila);
    }
}
