package Aula03;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public Conta(){
        this.numero = "0";
        this.saldo = 0;
    }
    public void creditar(double valor){
        saldo +=valor;
    }

    public void debitar(double valor){
        if(saldo>=0){
            saldo-=valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void tansferir(Conta contaDestino, double valor){
        contaDestino.creditar(valor);
        this.debitar(valor);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean equals(Conta conta){
        if(conta.getNumero().equals(this.getNumero()) && conta.getSaldo() == this.getSaldo()){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String resultado = "Conta número: "+this.numero+"\nSaldo: R$"+this.saldo;
        return resultado;
    }

}
