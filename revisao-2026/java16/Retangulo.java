package java16;

public final class Retangulo extends FiguraGeometrica {
    private Double lado;
    private Double altura;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }

}
