package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10; //vai de -2.147.483.647 até 2.147.483.647, representados por 32 bits
        long numeroGrande = 1000000L;
        float salarioFloat = 2500.00F; //semelhante a int, porém armazena um valor com ponto flutuante, representados por 32bits
        double salarioDouble = 2500.00D; //é consideravelmente bem maior que float também com ponto flutuante, representados por 64 bits
        byte idadeByte = 10; //é o tipo primitivo mais leve de todos,indo de -128 a 127, representado por apenas 8 bits
        short idadeShort = 10; //é o segundo tipo primitivo mais leve, armazenando valores de -32.768 a 32.767 
        boolean verdadeiro = true; //é um tipo lógico que pode receber apenas true ou false
        boolean falso = false;
        char caractere = 'A';   //também aceita unicode e ASCII
        //Casts
        double idade02 = (float) 1000; //força o tipo da variável original (double) a ser o float
        var nome2 = "Vegeta"; //Var é uma Variável que se adapta ao valor primitivo declarado à ela
        //String
        String nome = "Goku";
        System.out.println("A idade é de "+idade+" anos");
        System.out.println(falso);
        System.out.println("Char "+caractere);
        System.out.println("Oi, meu nome é "+nome);
    }
}
