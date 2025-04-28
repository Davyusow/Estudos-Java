package javacore.assiociacao.dominio;

public class Jogador {
    private String nome;
    private Time time = new Time();

    public Jogador(){
        this.nome = "<indefinido>";
        this.time.setNome("<indefinido>");
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Time: "+time.getNome());
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
