package javacore.modificadorestatico.dominio;

public class Anime {
    private String nome = "<desconhecido>";
    private static int[] episodios;
    static {   //o bloco de inicialização estático é carregado apenas uma vez, quando a classe é carregada pela
        //jvm, ou seja, na primeira vez que a classe for criada, enquanto blocos de inicialização não estáticos são
        //carregados toda vez que uma instância nova é criada
        episodios = new int[100];
        System.out.println("Dentro do bloco de inicialização estático");
        for(int i = 0; i < episodios.length;i++){
            episodios[i] = i+1;
        }

    }
    {   //bloco de inicialização da instância
        System.out.println("nova instância de anime!");
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
        Anime.episodios = episodios;
    }
}
