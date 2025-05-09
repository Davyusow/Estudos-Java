package Aula04;

public class Conta {
    private int[] numeros;

    public int setNumeros(int... numeros ) {
        int soma = 0;
        for(int n : numeros){
            soma+=n;
        }
        return soma;
    }
}
