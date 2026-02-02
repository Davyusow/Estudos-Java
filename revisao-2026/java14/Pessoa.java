public class Pessoa {
    // Classe padrão sem Records
    private String nome;
    private int idade;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        return result;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    @Override
    public boolean equals(Object obj) {
        // Pessoa other = (Pessoa) obj;
        // if (nome == null) {
        // if (other.nome != null)
        // return false;
        // } else if (!nome.equals(other.nome))
        // return false;
        // if (idade != other.idade)
        // return false;
        // return true;

        if (obj instanceof Pessoa pessoa) {
            if (pessoa.nome != null)
                return false;
            else if (!nome.equals(pessoa.nome))
                return false;
            if (idade != pessoa.idade)
                return false;

        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
