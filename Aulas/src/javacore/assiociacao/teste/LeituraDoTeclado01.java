package javacore.assiociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //configura a entrada input padrão do sistema para enviar os dados
        //no caso o teclado
        var texto = scanner.nextLine(); //scanner.next lê o texto até chegar em um espaço(apenas a primeira palavra)
        //scanner.next também inclui os espaços, então ele lê o texto até o enter
        System.out.println(texto);

        System.out.println("Digite seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("Digite \'M \'ou \'F\' para seu sexo: ");
        var sexo = scanner.next().charAt(0);    //lê a primeira letra da string
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);


    }
}
