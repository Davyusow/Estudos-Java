package javacore.Introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public void imprime(){
        System.out.println("----------------------------");
        System.out.println(this.nome);//'this' referencia a variável de classe local
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
