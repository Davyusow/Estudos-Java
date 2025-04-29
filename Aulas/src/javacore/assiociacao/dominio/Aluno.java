package javacore.assiociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {
        this.nome = "<indefinido>";
        this.idade = 0;
        this.seminario = null;
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome,idade);
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("-----\nNome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
