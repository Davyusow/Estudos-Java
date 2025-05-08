package classesutilitarias.strings.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "12345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.substring(3)); //vai não precisa do length -1, só com o primeiro argumento ele vai até o final
        System.out.println(numeros.substring(1,4));

        nome = "   Luffy  ";
        System.out.println(nome);
        System.out.println(nome.trim());    //remove os valores em branco da String
    }
}
