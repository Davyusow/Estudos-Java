package javacore.assiociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time() {
        this.nome = "<indefinido>";
    }
    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Time: "+this.nome);
        if(jogadores != null){
            for(Jogador jogador:jogadores){
                System.out.println(jogador.getNome());
            }
        }else{
            System.out.println("<Sem jogadores>");
        }
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }
    public Jogador[] getJogadores(){
        return this.jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
