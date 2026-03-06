package davyusow.javacore.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize01 {
    public static void main(String[] args) {
        Path homeDirPath = Paths.get("/home/davyusow");
        Path projDirPath = Paths.get("/home/davyusow/Projetos/Ola-mundo.java");

        Path pathToProj = homeDirPath.relativize(projDirPath);
        // Fala o caminho *Relativo* para chegar naquele arquivo/diretório
        Path pathToHome = projDirPath.relativize(homeDirPath);

        IO.println(pathToProj);
        IO.println(pathToHome);
    }
}
