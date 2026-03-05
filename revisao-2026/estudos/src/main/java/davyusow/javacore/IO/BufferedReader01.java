package davyusow.javacore.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
Também mais otimizado que usar somente o FileReader
*/
public class BufferedReader01 {
    public static void main(String[] args) {
        File file = new File("arquivo.md");

        try (FileReader fReader = new FileReader(file)) {
            BufferedReader bfReader = new BufferedReader(fReader);

            String linha;
            // lê uma linha completa, quando chega no final do arquivo retrona null
            while ((linha = bfReader.readLine()) != null) {
                IO.println(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
