package javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;    //o modificador estático faz com que todas as instâncias
    //do objeto sofram as mudanças que a variável receber, por exemplo, se a velocidade limite mudar de 250 para 180
    //todas as instâncias de carro terão a velocidade limite de 180

    public Carro(){
        this.nome = "<indefinido>";
        this.velocidadeMaxima = 0;
    }
    public Carro(String nome,double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+this.velocidadeLimite);
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
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double novoLimite){
        velocidadeLimite = novoLimite;
    }

}
