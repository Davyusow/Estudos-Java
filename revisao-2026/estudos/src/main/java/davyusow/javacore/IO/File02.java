package davyusow.javacore.IO;

import java.io.File;
import java.io.IOException;

public class File02 {
    public static void main(String[] args) {
        File diretorio = new File("pasta");
        diretorio.mkdir(); // hehe

        IO.println(diretorio.getAbsolutePath() + " é um diretório?: " + diretorio.isDirectory());

        File arquivo = new File(diretorio.getAbsolutePath() + "/arquivo.md");

        // por conta do try catch, é bom isolar essa lógica em um método
        try {
            arquivo.createNewFile();
            IO.println("É arquivo?: " + arquivo.isFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File arquivoRenomeado = new File(diretorio.getAbsolutePath() + "/arquivo-renomeado.md");
        arquivo.renameTo(arquivoRenomeado);

        IO.println("Foi renomeado?: " + arquivoRenomeado.isFile());
    }
}
