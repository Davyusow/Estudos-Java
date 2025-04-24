package javacore.blocosinicialiazacao.dominio;

public class Anime {
    private String nome = "<desconhecido>";
    private int[] episodios;
    {   //ao inicializar uma variável, você pode trazer um bloco de inicialização junto
        //os valores dentro do bloco serão o padrão da classe independente do construtor
        episodios = new int[100];
        for(int i = 0; i < episodios.length;i++){ episodios[i] = i+1; }
        for(int episodio:episodios){
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
