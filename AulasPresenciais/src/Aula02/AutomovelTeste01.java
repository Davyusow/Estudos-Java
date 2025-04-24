package Aula02;

import java.util.Scanner;

public class AutomovelTeste01 {
    public static void main(String[] args) {
        Automovel automovel = new Automovel("Azul","Kwid",true,20);

        for (int i = 0; i < 8;i++){
            automovel.acelerar();
        }
        for(int i = 0; i<8;i++) {
            automovel.frear();
        }
        automovel.imprime();
        Scanner scanner = new Scanner(System.in);   //cria um objeto que lê comandos do usuário, o parâmetro system in
        //lê o valor de entrada padrão do sistema, no caso, o teclado
        System.out.println("Digite a cor da bagaça: ");
        String cor = scanner.nextLine();
        System.out.println("Digite o modelo da jossa: ");
        String modelo = scanner.nextLine();
        System.out.println("ta fazendo vrum vrum(S/N)? : ");
        boolean ligado = scanner.nextBoolean();
        System.out.println("Qual o número da setinha? ");
        int velocidade = scanner.nextInt();
        Automovel automovel2 = new Automovel(cor,modelo,true,velocidade);
        automovel2.imprime();
        
    }
}
