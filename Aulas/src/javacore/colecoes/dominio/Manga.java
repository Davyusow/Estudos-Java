package javacore.colecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id); //não permite o campo ser nulo
        Objects.requireNonNull(nome);
        Objects.requireNonNull(preco);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public Manga(Long id, String nome, double preco,int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Mangá{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preço=" + preco +
                ", quantidade" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se this < outroManga
        //se this == outroManga return 0
        //positivo se this > outroManga
        //        if (this.id <  outroManga.getId())
        //            return -1;
        //        else if (this.id > outroManga.getId())
        //            return 1;
        //        else
        //            return 0;
        return this.id.compareTo(outroManga.getId()); //já que id é um Wrapper
        //todos os Wrappers possuem compareTo nativamente
    }
}
