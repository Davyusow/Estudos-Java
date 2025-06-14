package javacore.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa { //o abstract fica antes do class

    //uma classe abstrata não pode ser instânciada, e serve para ser extendida
    //apesar disso é possível fazer construtores

    //como Funcionário é uma classe abstrata, ele não é obrigado a implementar os métodos abstratos de Pessoa
    //Mas, se implementar será necessário apenas uma única vez, podendo ainda ser sobrescrita

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    @Override
    public void imprime(){
        System.out.println("Imprimindo...\n"+toString());
    }

    public abstract void calculaBonus(); //métodos abstratos não fazem nada
    //servem apenas para serem sobrescritos nas subclasses
    //onde eles obrigam as subclasses a fazer uma implementação do método

    @Override
    public String toString() {
        return "Funcionário\nNome: "+this.nome+"\nSalário: "+this.salario;
    }
}
