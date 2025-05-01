package javacore.modificadorfinal.dominio;

public final class Carro { //o modificador final faz com que a classe não possa ser extendida
    //isso é usar o "extends Carro" em outra classe
    private String nome;
    private double velocidadeMaxima;
    public final Comprador COMPRADOR = new Comprador();
    private static final double VELOCIDADE_LIMITE = 250; //o modificador final transforma o valor em uma constante
    //e precisa ser declarado no momento da declaração


    public Carro(){
        this.nome = "<indefinido>";
        this.velocidadeMaxima = 0;
    }
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public final void imprime(){ //ao fazer um método final, ele não poderá ser sobrescrito em uma subclasse
        System.out.println("------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+this.VELOCIDADE_LIMITE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }
    public Comprador getCOMPRADOR(){
        return this.COMPRADOR;
    }
}
