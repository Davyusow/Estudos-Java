package javacore.lambda.dominio;

public class Anime {
    private String titulo;
    private Integer episodios;

    public Anime(String titulo, Integer episodios) {
        this.titulo = titulo;
        this.episodios = episodios;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "titulo='" + titulo + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
