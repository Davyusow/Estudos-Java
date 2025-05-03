package javacore.polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.05;
    private String dataValidade;
    public Tomate(String nome,double valor){
        super(nome,valor);
    }
    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO ;
    }
    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
