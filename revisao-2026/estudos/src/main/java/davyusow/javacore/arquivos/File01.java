package davyusow.javacore.arquivos;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class File01 {

    public static void main(String[] args) {


        File file = new File("arquivo.txt");

        try {
            file.createNewFile(); //retorna um booleano se o arquivo foi criado
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: ");
            e.printStackTrace();
        }

        System.out.println("Path: " + file.getAbsolutePath());

        /* Além disso tem diversas verificações extras para uma classe file: */
        System.out.println(
        "\nÉ um arquivo?: " + file.isFile()+
        "\nÉ um diretório?: " +file.isDirectory() +
        "\nÉ um arquivo oculto?: "+file.isHidden() +
        "\nPode ser lido?: "+file.canRead() +
        "\nPode ser escrito?: " +file.canWrite() +
        "\n Última modificação: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime()
        // lastModified pode ser convertido para instant para uma vizualização mais clara (aqui foi pra um instant pra um localdatetime)
        );

        if (file.exists()) {
            file.delete();
        }
    }
}
