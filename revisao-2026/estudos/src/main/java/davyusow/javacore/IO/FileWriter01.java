package davyusow.javacore.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("arquivo.md");

        // Abre e fecha automaticamente
        try (FileWriter fWriter = new FileWriter(file, true)) { // o parâmetro true, permite apenas concatenar
            fWriter.write("""
                    # Hello World em java 25!

                    ```java
                    void start() {
                        IO.println("Hello, World!");
                    }
                    ```
                    """);
            fWriter.flush(); // limpa o buffer, ou a stream usada
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
