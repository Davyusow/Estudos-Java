package javacore.assiociacao.teste;

import javacore.assiociacao.dominio.Jogador;
import javacore.assiociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Rivaldo");
        Jogador jogador03 = new Jogador("Vini jr");

        Time time01 = new Time("Brasil");
        Jogador[] jogadores01 = new Jogador[]{jogador01,jogador02,jogador03};

        jogador01.setTime(time01);
        time01.setJogadores(jogadores01);
        time01.imprime();
        System.out.println("------------");
        jogador01.imprime();
    }
}
