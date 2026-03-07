package davyusow.javacore.Streams.model;

public class LightNovel {
    private String titulo;
    private Double preco;

    public LightNovel(String titulo, Double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public LightNovel() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((preco == null) ? 0 : preco.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof LightNovel))
            return false;
        LightNovel other = (LightNovel) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (preco == null) {
            if (other.preco != null)
                return false;
        } else if (!preco.equals(other.preco))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("LightNovel [titulo=%s, preco=%s]", titulo, preco);
    }

}
