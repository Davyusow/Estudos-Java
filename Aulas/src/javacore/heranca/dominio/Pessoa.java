package javacore.heranca.dominio;

public class Pessoa {
    protected String nome; //protected faz com que qualquer subclasse de Pessoa
    //e classes dentro do mesmo pacote consigam acessar o valor da variável
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Classe Pessoa Criada!\n");
    }
    {
        System.out.println("\nInstância de pessoa criada!\n");
    }
    public Pessoa(){
        this.nome = "<indefinido>";
        this.cpf = "<indefinido>";
    }
    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("-----------------------\nNome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Endereço: CEP: "+endereco.getRua()+" Rua: "+endereco.getCep());
    }

}
