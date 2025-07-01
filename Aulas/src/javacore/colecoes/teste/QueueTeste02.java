package javacore.colecoes.teste;

import javacore.colecoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Fulaninho de tal");
        Queue<Consumidor> consumidorQueue = new PriorityQueue<>() ;//comparator no priority queue
        consumidorQueue.add(consumidor1);
    }
}
