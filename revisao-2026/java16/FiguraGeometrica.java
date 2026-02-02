package java16;

// Classes Sealed, limitam quais classes podem extender dela
// Mais útil para bibliotecas
public sealed abstract class FiguraGeometrica permits Circulo, Quadrado, Retangulo {

    protected String cor;

    public double calcularArea() {
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
