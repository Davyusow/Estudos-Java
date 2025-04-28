package javacore.assiociacao.teste;

import javacore.assiociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Grafite");
        Jogador jogador03 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador01,jogador02,jogador03};
        for(Jogador jogador:jogadores){
            jogador.imprime();
        }
    }
}
