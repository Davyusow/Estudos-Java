package javacore.enumeracao.dominio;

public enum TipoCliente {   //é uma classe que cria várias constantes estáticas e finais
    //útil para uma quantidade exata de váriaveis
    //como dias da semana, meses, genero de filme, etc.
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor,String nomeRelatorio){
        this.valor = valor; //retorna o valor inteiro da constante, útil para designar ID em banco de dados
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public static TipoCliente tipoClienteRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente: values()){//values() é um array de todas as enumerações da classe atual
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }
}
