package javacore.assiociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local = new Local("");

    public Seminario(){
        this.titulo = "<indefinido>";
        this.alunos = null;
        this.local = null;
    }
    public Seminario(String titulo,Aluno[] alunos,String local){
        this.titulo = titulo;
        this.alunos = alunos;
        this.local.setEndereco(local);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    public void imprime(){
        System.out.println("----------------------------\nTítulo do seminário: "+titulo);
        System.out.println("Local: "+local.getEndereco());
        System.out.println("Alunos: ");
        for(Aluno aluno:alunos){
            aluno.imprime();
        }
        System.out.println("\n");

    }
}
