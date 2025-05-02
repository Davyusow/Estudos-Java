package javacore.enumeracao.dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    },
    DEBITO{
      @Override
      public double calcularDesconto(double valor){ //sobrescreve o método calcular desconto no caso do tipo pagamento for débito
          return valor * 0.1;
      }
    };
    public abstract double calcularDesconto(double valor); //funciona como um molde para os métodos dos tipos Credito e débito
    //servindo apenas para ser sobrescrito com @Override
    //podendo ser diferente para cada implementação
    //ums boa analogia é a forma de bolo, ele não faz o bolo, mas molda a forma dele
}
