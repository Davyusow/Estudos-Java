package javacore.comportamento.dominio;

public class Carro {
    private String nome = "Audi";
    private String cor;
    private String ano;

    public Carro(String cor, String ano) {
        this.cor = cor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
