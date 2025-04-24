package javacore.Introducaometodos.dominio;

public class Pessoa {
    private String nome;    //o modificador de acesso 'private' limita o acesso à apenas a classe atual
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
