package javacore.NIO.teste;


import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1,"glob:*.bkp"); //desconsidera os diretórios
        matches(path1,"glob:**.bkp"); //considera diretórios
        matches(path1,"glob:**.{bkp,java,txt}"); //agrupa as extensões de arquivo(não pode ter espaço entre as extenções)
        matches(path2,"glob:**.{bkp,java,txt}");
        matches(path3,"glob:**.{bkp,java,txt}");
        matches(path1,"glob:**.???"); //todos os arquivos com 3 caracteres na extensão
        matches(path3,"glob:**/file.????");
    }
    public static void matches(Path path,String glob){ //alternativa ao simpleFileVisitor
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
