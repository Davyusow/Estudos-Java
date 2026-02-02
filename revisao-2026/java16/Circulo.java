package java16;

public non-sealed class Circulo extends FiguraGeometrica {
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(Math.PI * raio, 2);
    }

}
