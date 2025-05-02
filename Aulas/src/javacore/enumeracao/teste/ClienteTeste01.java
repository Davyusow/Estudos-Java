package javacore.enumeracao.teste;

import javacore.enumeracao.dominio.Cliente;
import javacore.enumeracao.dominio.TipoCliente;
import javacore.enumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);//método para chamar as constantes da classe enum
        Cliente cliente02 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente03 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente04 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
    }
}
