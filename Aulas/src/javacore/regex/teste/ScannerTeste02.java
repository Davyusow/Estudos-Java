package javacore.regex.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(", "); //o scanner vai usar a vírgula de delimitador
       // while (scanner.hasNext()){  //enquanto o scanner tiver um valor após o delimitador
       //     System.out.println(scanner.next());//imprime o próximo valor
       // }
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                System.out.println("Inteiro: "+scanner.next());
            }else if (scanner.hasNextBoolean()){
                System.out.println("Booleano: "+scanner.next());
            }else{
                System.out.println("String: "+scanner.next());
            }

        }
    }
}
