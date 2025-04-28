package javacore.assiociacao.dominio;

public class Professor {
    private String nome;

    public Professor(){
        this.nome = "<indefinido>";
    }
    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
