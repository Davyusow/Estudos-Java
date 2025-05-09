package Aula04; //importado do diretório "$HOME/Projetos/Java/Estudos-Java/AulasPresenciais/src/Aula04"
                //porém neste caso, está assumindo implicitamente que a classe está na mesma pasta que o pacote

import java.util.Scanner; //importando uma biblioteca do java

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte b = 4;
        byte c = 10;
        int i = b*c;
        int j = b * 200;
        int k = 'A' + i;
        long l = 10 + k + i;
        //quando mais de um tipo estão envolvidos, o maior tipo será o prevalecente
        i = (byte) 10; //ao reduzir a amplitude do tipo, é necessário o uso do cast
        //inicialização literal:
        byte valor = 100; //-128 até 127
        float f1 = 20.0F;   //o 'F' explicita que é um float
        double d1 = 20.0D;  //o 'D' explicita que é um double
        //o cast não é possível com o tipo booleano
        Scanner scanner;
        Conta conta = new Conta();
        System.out.println(conta.setNumeros(1,2,3,4,5,6,7,8,9,10));
    }
}
