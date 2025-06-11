package javacore.colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Reflexivo,Simétrico,Transitivo e Consistente, ou seja, ser uma relação de equivalência
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }   //reflexiva
        if(this == obj) {
            return true;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

    }

    //se x.equals(y) == true, y.hashCode(x) tem que ser igual a x.hashCode(y)
    //y.hashCode(x) == x.hashCode(y) não necessariamente garante que os dois são iguais
    //se x.hashCode(y) == false, estão x.equals(y) == false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
}
