package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DOSFileAttributes01 {
    public static void main(String[] args) throws IOException {
        Path arquivoPath = Paths.get("assets/file.txt");
        if (!Files.exists(arquivoPath)) {
            Files.createFile(arquivoPath);
        }

        // Talvez seja interessante para criar aqueles arquvos .lock
        Files.setAttribute(arquivoPath, "dos:hidden", true);
        Files.setAttribute(arquivoPath, "dos:readonly", true);

        DosFileAttributes dosFa = Files.readAttributes(arquivoPath, DosFileAttributes.class);

        IO.println("Oculto?: " + dosFa.isHidden());
        IO.println("Apenas leitura?: " + dosFa.isReadOnly());
    }
}
