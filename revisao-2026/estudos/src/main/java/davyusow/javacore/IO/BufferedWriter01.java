package davyusow.javacore.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
Mais otimizado que o FileWriter para arquivos maiores
quarda na memória o conteúdo(buffer) para depois sim guardar no disco
*/
public class BufferedWriter01 {
    public static void main(String[] args) {
        File file = new File("arquivo.md");

        // Tudo isso lembra bastante os FILE de C, por ser bem baixo nível
        try (FileWriter fWriter = new FileWriter(file)) {
            BufferedWriter bfWriter = new BufferedWriter(fWriter);

            bfWriter.write("""
                    # Hello World em java 25!

                    ```java
                    void start() {
                        IO.println("Hello, World!");
                    }
                    ```
                    """);
            bfWriter.newLine(); // pula a linha sem depender do \n, já que os sistemas DOS usam \r\n (se não me
                                // engano)
            bfWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
