package Aula01;

public class Conta {
    private String numero;
    private double saldo;
    public Conta(){
        this.numero = "";
        this.saldo = 0;
    }
    public Conta(String numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
