package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStream01 {
    // ls em java 🫩
    public static void main(String[] args) {
        Path root = Paths.get(".");

        try (DirectoryStream<Path> fluxoDir = Files.newDirectoryStream(root)) {
            fluxoDir.forEach(IO::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
