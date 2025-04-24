package javacore.Introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salarios;

    public Funcionario(){
        this.nome = "<desconhecido>";
        this.idade = 0;
        this.salarios = null;
    }
    public Funcionario(String nome,int idade,float[] salario){
        this.nome = nome;
        this.idade = idade;
        this.salarios = salario;
    }

    public void imprimir(){
        System.out.printf("Nome: %s\nIdade: %d\n",this.nome,this.idade);
        float media = 0;
        for(int i = 0;i < salarios.length;i++){
            System.out.printf("Salário %d: R$%.2f\n",i+1,this.salarios[i]);
            media+=salarios[i];
        }
        System.out.printf("Média dos salários: R$%.2f\n",media/salarios.length);
    }
}
