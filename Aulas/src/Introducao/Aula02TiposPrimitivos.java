package Introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10; //vai de -2.147.483.647 até 2.147.483.647, representados por 32 bits
        long numeroGrande = 1000000;
        float salarioFloat = 2500; //semelhante a int, porém armazena um valor com ponto flutuante, representados por 32bits
        double salarioDouble = 2500; //é consideravelmente bem maior que float também com ponto flutuante, representados por 64 bits
        byte idadeByte = 10; //é o tipo primitivo mais leve de todos,indo de -128 a 127, representado por apenas 8 bits
        short idadeShort = 10; //é o segundo tipo primitivo mais leve, armazenando valores de -32.768 a 32.767 
        boolean verdadeiro = true; //é um tipo lógico que pode receber apenas true ou false
        boolean falso = false;
        char caractere = 'A';   //também aceita unicode e ASCII
        System.out.println("A idade é de "+idade+" anos");
        System.out.println(falso);
        System.out.println("Char "+caractere);

    }
}
