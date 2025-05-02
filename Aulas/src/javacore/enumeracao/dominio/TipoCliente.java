package javacore.enumeracao.dominio;

public enum TipoCliente {   //é uma classe que cria várias constantes estáticas e finais
    //útil para uma quantidade exata de váriaveis
    //como dias da semana, meses, genero de filme, etc.
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    private int valor;
    TipoCliente(int valor){
        this.valor = valor; //retorna o valor inteiro da constante, útil para designar IDS em banco de dados
    }

    public int getValor() {
        return valor;
    }
}
