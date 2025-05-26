package javacore.serializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {    //"implements Serializable" é necessário para aplicar a serialização
    private int id;
    private String nome;
    private transient String senha; //este atributo não deve ser serializado
    //quando a classe for deserializada este valor será null
    //atributos estáticos não são serializados
    //public static final String NOME_ESCOLA = "Aquela";

    public Aluno(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
