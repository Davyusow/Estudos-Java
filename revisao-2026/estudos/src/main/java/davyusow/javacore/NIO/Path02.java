package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path02 {
    public static void main(String[] args) {
        Path diretorioPath = Paths.get("pasta");
        Path subDiretoioPath = Paths.get(diretorioPath.toString(), "subPasta");
        Path arquivoPath = Paths.get(diretorioPath.toString(), "/arquivo.md");

        try {
            if (Files.notExists(diretorioPath) || Files.notExists(arquivoPath)) {
                Files.createDirectories(diretorioPath); // create directoty cria uma pasta
                // create directiories cria várias encadeadas
                Files.createFile(arquivoPath);

                Files.copy(arquivoPath, subDiretoioPath, StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void copiar(Path arquivo, Path destino) throws IOException {
        Files.copy(arquivo, destino);
    }
}
