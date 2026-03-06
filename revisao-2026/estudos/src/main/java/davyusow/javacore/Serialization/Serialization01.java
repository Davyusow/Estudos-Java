package davyusow.javacore.Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import davyusow.javacore.Serialization.model.Aluno;

@SuppressWarnings("unused")
public class Serialization01 {
    private static final Path data_dir = Paths.get("data/aluno.md");

    public static void main(String[] args) {
        var aluno_01 = new Aluno(UUID.randomUUID(), "Beltrano", "123");

        derializar();
    }

    private static void serializar(Aluno aluno) {
        // Só a jvm consegue ler essa bagaça ai,
        try (var output = new ObjectOutputStream(Files.newOutputStream(data_dir))) {
            output.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void derializar() {
        // Só a jvm consegue ler essa bagaça ai,
        try (var input = new ObjectInputStream(Files.newInputStream(data_dir))) {
            Aluno aluno = (Aluno) input.readObject();
            IO.println("Aluno do arquivo: " + aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
