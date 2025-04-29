package javacore.assiociacao.teste;

import java.util.Random;
import java.util.Scanner;

public class LeituraDoTeclado02Ex01 {
    public static void main(String[] args) {
        System.out.println("Akinator paieza: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite sua Pergunta [0 para sair]: ");
        scanner.nextLine();
        num = random.nextInt(0,2);
        switch (num) {
            case 1:
                System.out.println("Sim");
                break;
            case 0:
                System.out.println("Não");
                break;
            default:
                System.out.println("<Caso indefinido>");
                break;
        }
        System.out.println("Finalizando...");
    }
}
