package javacore.Interfaces.dominio;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do arquivo");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dado do arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
