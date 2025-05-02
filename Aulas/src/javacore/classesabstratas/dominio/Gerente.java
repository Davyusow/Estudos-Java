package javacore.classesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome,double salario){
        super(nome,salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario*0.05;
    }

    @Override
    public String toString() {
        return "Gerente\nNome: "+this.nome+"\nSalário: "+this.salario;
    }
}
