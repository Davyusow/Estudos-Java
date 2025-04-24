package javacore.Introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        //estudante.nome = "Goten"; alterações no valor do parâmetro dentro desta classe alteram o valor da variável de referência
        //e no objeto em memória
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo+"\n---------------------");
    }
}
