package Aula02;

public class Automovel {
    private String cor;
    private String modelo;
    private boolean ligado;
    private int velocidadeAtual;

    public Automovel(){
        this.cor = "<indefinido>";
        this.modelo = "<indefinido>";
        this.ligado = false;
        this.velocidadeAtual = 0;
    }
    public Automovel(String cor,String modelo,boolean ligado, int velocidadeAtual){
        this.cor = cor;
        this.modelo = modelo;
        this.ligado = ligado;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void ligar(){
        //procedimento ligar
        ligado = true;
    }
    public void acelerar(){
        //procedimento acelerar
        if(velocidadeAtual <= 120){
            this.velocidadeAtual+=20;
        }else{
            System.out.println("Velocidade máxima atingida");
        }
        System.out.println(this.velocidadeAtual);
    }
    public void frear(){
        //procedimento frear
        if(velocidadeAtual <=20){
            velocidadeAtual = 0;
            System.out.println("Carro parado");
        }else {
            velocidadeAtual-=20;
        }
        System.out.println(this.velocidadeAtual);
    }
    public void imprime(){
        System.out.println(getCor());
        System.out.println(getModelo());
        System.out.println(getVelocidadeAtual());
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
