package javacore.excecao.runtime.teste;

import java.sql.SQLOutput;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        //checked arithmeticException
        System.out.println(divide(1,0)); //CTRL + Q para ver os parâmetros
    }

    // ao colocar "/**" em cima de um método, irá trazer uma documentação dos parâmetros dele
    //auxiliando na designação dos parâmetros e no auxilio do código
    //é recomendado fazer isso apenas quando o método estiver completo
    /**
     *
     * @param numerador
     * @param divisor não pode ser zero
     * @return a divisão entre o numerador e o divisor
     * @throws IllegalArgumentException caso o divisor seja 0
     */
    private static int divide(int numerador,int divisor) throws IllegalArgumentException{ //o trhows apenas indica que a excessão pode acontecer
        if(divisor == 0)
            throw new IllegalArgumentException("Divisão por 0 inválida");//exceção de argumento inválido
        //throw new lança a exceção em um lugar, neste caso no console, com javafx é possível lançar na interface gráfica
        return numerador/divisor;
    }
}
