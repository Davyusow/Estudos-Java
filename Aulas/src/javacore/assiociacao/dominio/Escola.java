package javacore.assiociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(){
        this.nome = "<indefinido>";
    }
    public Escola(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        if(professores != null){
            for(Professor professor:professores){
                System.out.println(professor.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
