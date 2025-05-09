package classesutilitarias.strings.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Kaido";
        nome = nome.concat(" Da Silva");
        StringBuilder stringBuilder = new StringBuilder("Kaido");
        stringBuilder.append(" da Silva");
        System.out.println(nome);

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(0,4)); // apaga o texto nos índices escolhidos

    }
}
