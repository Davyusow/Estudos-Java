package davyusow.javacore.Collections.model;

import java.util.UUID;

public class Manga implements Comparable<Manga> {
    private UUID id;
    private String nome;
    private Double preco;

    public Manga(String nome, Double preco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
    }

    public Manga() {
        this.id = UUID.randomUUID();
        this.nome = "";
        this.preco = 0.0D;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((preco == null) ? 0 : preco.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Manga))
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
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
        return String.format("Manga [id=%s, nome=%s, preco=%s]", id, nome, preco);
    }

    // Ordena em relação ao nome
    @Override
    public int compareTo(Manga arg0) {
        // Negativo de menor, Positivo de maior, e 0 se igual
        if (this.nome.compareTo(arg0.getNome()) > 0) {
            return 1;
        } else {
            return -1;
        }

    }

}
