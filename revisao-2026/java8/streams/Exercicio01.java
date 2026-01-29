package java8.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Exercicio01 {

    public static Optional<List<String>> lerNomesDoArquivo(
        String caminhoArquivo
    ) {
        try {
            List<String> nomes = Files.readAllLines(Paths.get(caminhoArquivo));
            return Optional.of(nomes);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        String caminhoArquivo = "java8/streams/nomes.txt";
        Optional<List<String>> nomesOpt = lerNomesDoArquivo(caminhoArquivo);

        List<String> nomes = nomesOpt.orElseThrow(() ->
            new RuntimeException(
                "Lista de nomes vazia ou arquivo não encontrado."
            )
        );
        Scanner leitor = new Scanner(System.in);

        short pagina = 0;
        short TAMANHO_PAGINA = 5;
        int total = nomes.size();

        while (pagina * TAMANHO_PAGINA < total) {
            int inicio = pagina * TAMANHO_PAGINA;
            int fim = Math.min(inicio + TAMANHO_PAGINA, total);

            nomes.subList(inicio, fim).forEach(System.out::println);

            pagina++;
            if (fim >= total) break;

            System.out.print(
                "###################\nPágina %d/%d\nPróxima página (S/s): ".formatted(
                    pagina,
                    total / TAMANHO_PAGINA - 1
                )
            );
            String resposta = leitor.nextLine().strip();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
        leitor.close();
    }
}
