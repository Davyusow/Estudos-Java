package javacore.assiociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(){
        this.nome = "<indefinido>";
        this.especialidade = "<indefinido>";
    }
    public Professor(String nome){
        this.nome = nome;
    }
    public Professor(String nome,String especialidade,Seminario[] seminarios){
        this(nome);
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Professor: "+nome);
        System.out.println("Especialidade: "+especialidade);
        System.out.println("----------------------------\nSeminários: ");
        for (Seminario seminario: seminarios){
            seminario.imprime();
        }
    }
}
