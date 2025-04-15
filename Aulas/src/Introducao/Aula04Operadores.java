package Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02-numero01);
        System.out.println(numero02+numero01); //soma os valores
        System.out.println("Resultado: "+numero01+numero02); //concatena os valores, por isso é recomendado fazer os cálculos fora dos prints
        int resultado01 = numero01*numero02;
        int resultado02 = numero02 / numero01;
        System.out.println(resultado01);
        System.out.println(resultado02); //imprime o resultado inteiro
        System.out.println((double)resultado02); //imrpime o resultado em ponto flutuante
        // % mod
        int resultado03 = 20 % 2;
        System.out.println(resultado03);
        // operadores lógicos, >, <, >=, <=, ==, !=,
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezDiferenteQueVinte = 10!=20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueVinte);
        //&& (e), || (ou), ! (XOR ou exclusivo)
        int idade = 29;
        float salario = 3500.00F;
        boolean isDentroDaLeiMaiorQUeTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQUeTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei? "+isDentroDaLeiMaiorQUeTrinta);
        System.out.println("Dentro da lei? "+isDentroDaLeiMenorQUeTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorSwitch = 5400F; //chute esperançoso
        boolean isSwitchDoisCompravel = valorTotalContaCorrente >= valorSwitch || valorTotalContaPoupanca >= valorSwitch;
        
        //operadores de atribuição: =, +=, -=, /=, *=, %=
        double bonus = 1800;
        bonus += 1000; // mesma coisa que : bonus = bonus + 1000; ou : bonus = 1800 + 1000 o termo disso é hard coding
        bonus -= 1000; // mesma coisa que : bonus = bonus - 1000;
        bonus *= 2; // mesma coisa que : bonus = bonus * 2;

        //incrementadores: ++, --
        int incrementador = 0;
        incrementador++; //incrementa após essa linha
        ++incrementador; //incrementa no ínicio da linha
        incrementador--;
        --incrementador;
    }
}
