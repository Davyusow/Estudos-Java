package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributes01 {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes
        // PosixFileAttributes
        // DosFileAttributes

        var data = LocalDateTime.now().minusYears(1);

        Path arquivoPath = Paths.get("assets/file.txt");

        if (!Files.exists(arquivoPath)) {
            Files.createFile(arquivoPath);
        }

        // Porque java 1.7 porque...
        Files.setLastModifiedTime(arquivoPath, FileTime.from(data.toInstant(ZoneOffset.of("-03:00"))));

    }
}
