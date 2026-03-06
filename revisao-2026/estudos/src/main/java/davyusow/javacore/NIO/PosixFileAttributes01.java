package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;

public class PosixFileAttributes01 {
    public static void main(String[] args) throws IOException {
        Path arquivoPath = Paths.get("assets/file.txt");
        PosixFileAttributes posFa = Files.readAttributes(arquivoPath, PosixFileAttributes.class);

        IO.println(posFa.permissions());

        PosixFileAttributeView posFaView = Files.getFileAttributeView(arquivoPath, PosixFileAttributeView.class);
        
        var permissions = PosixFilePermissions.fromString("rwxrw-rw-");
        posFaView.setPermissions(permissions);

        IO.println(posFa.permissions());
    }
}
