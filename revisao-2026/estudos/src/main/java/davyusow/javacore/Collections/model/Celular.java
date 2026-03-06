package davyusow.javacore.Collections.model;

public class Celular {
    private String numSerial;
    private String marca;

    public Celular(String numSerial, String marca) {
        this.numSerial = numSerial;
        this.marca = marca;
    }

    public String getNumSerial() {
        return numSerial;
    }

    public void setNumSerial(String numSerial) {
        this.numSerial = numSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("Celular [numSerial=%s, marca=%s]", numSerial, marca);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numSerial == null) ? 0 : numSerial.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Celular))
            return false;
        Celular other = (Celular) obj;
        if (numSerial == null) {
            if (other.numSerial != null)
                return false;
        } else if (!numSerial.equals(other.numSerial))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }

}
