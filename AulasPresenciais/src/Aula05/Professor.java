package Aula05;

public class Professor extends Pessoa{
    private String area;
    private String nivel;
    private double salario;

    public Professor(String cpf, String nome, int dia, int mes, int ano,String area,String nivel,double salario){
        super(cpf,nome,dia, mes, ano);
        this.area = area;
        this.nivel = nivel;
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
