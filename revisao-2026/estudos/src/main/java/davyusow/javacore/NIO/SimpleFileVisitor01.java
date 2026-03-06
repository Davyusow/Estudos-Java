package davyusow.javacore.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitor01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("/home/davyusow/Projetos/Java/Estudos-Java/revisao-2026/estudos/");
        Files.walkFileTree(root, new LsRecursivo());
    }
}

// LsRecursivo e ainda por cima com grep ".java"!
class LsRecursivo extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java")) {
            IO.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}