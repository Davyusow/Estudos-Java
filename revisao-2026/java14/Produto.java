//também é possível utilizar anotações do javax!

public record Produto(String nome, int quantidade, double preco) implements Comparable {
    // já tem getters, setters, hashcode e equals implementados
    // muito útil para DTOS, wrappers e classes temporárias

    // Também é possível implementar interfaces!
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
