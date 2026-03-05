package davyusow.javacore.IO;

import java.io.File;
import java.io.FileReader;

public class FileReader01 {
    public static void main(String[] args) {
        File file = new File("arquivo.md");

        try (FileReader fReader = new FileReader(file)) {
            int resultado = fReader.read(); // retorna um inteiro do valor caractere na tabela ASCII (#)
            IO.println("Resultado: " + resultado);

            // int tamanho = (int) file.length(); // tamanho do arquivo
            // char[] input = new char[tamanho];
            // fReader.read(input); // Aqui o red põe o valor lido no char[]

            int i = 0;
            while ((i = fReader.read()) != -1) { // final do arquivo é -1, semelhante ao \0 do C
                IO.print((char) i); // cast para imprimir o caractere exato:
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
