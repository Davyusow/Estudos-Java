package javacore.assiociacao.dominio;

public class Time {
    private String nome;

    public Time() {
        this.nome = "<indefinido>";
    }
    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
