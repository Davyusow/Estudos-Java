package javacore.excecao.runtime.teste;

//runtime exception retorna um erro em tempo de compilação
//impedindo o programa de ser compilado e não chegar nem a ser rodado
//sendo as exceções mais comuns

//exceções checked não necessitam de tratamento
//e exceções unchecked precisam de tratamento

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());  //null pointer exception
    }
}
