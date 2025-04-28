package javacore.assiociacao.teste;

import javacore.assiociacao.dominio.Jogador;
import javacore.assiociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time01 = new Time("Seleção Brasileira");
        jogador01.setTime(time01);
        jogador01.imprime();
    }
}
