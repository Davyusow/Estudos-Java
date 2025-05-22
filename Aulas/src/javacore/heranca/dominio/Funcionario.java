package javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    int cargaHoraria;
    static{
        System.out.println("Instância de Funcionário criada!\n");
    }
    public Funcionario(){
        super();
    }
    public Funcionario(String nome,String cpf){
        super(nome,cpf);    //chama o construtor dos argumentos dados
    }
    public Funcionario(String nome,String cpf,int cargaHoraria){
        super(nome,cpf);    //chama o construtor dos argumentos dados
        this.cargaHoraria = cargaHoraria;
    }

    private double salario;

    public void imprime(){
        super.imprime();    //chama uma função da classe pai da herança
        System.out.println("Salário: R$"+getSalario());
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" Recebi o salário de R$"+this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }

}
