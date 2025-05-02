package javacore.Interfaces.dominio;

public interface DataLoader {
    //interfaces não podem ser instânciadas
    //podem ser declarados atributos em interfaces, onde por padrão são constantes com modificador final e static
    int numero = 10; //public static final int numero = 10;

    void load();    //todos os métodos são públicos e abstratos por padrão
    default void checkPermission(){ //implementa um método padrão sem obrigar uma implementação
        System.out.println("Fazendo checagem de permissões");
    }
}
