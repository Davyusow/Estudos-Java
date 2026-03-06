package davyusow.javacore.Serialization.model;

import java.io.Serializable;
import java.util.UUID;

public class Aluno implements Serializable{
    private UUID id;
    private String nome;
    private String senha;

    public Aluno(UUID id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", senha=" + senha + "]";
    }

}
