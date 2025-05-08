package classesutilitarias.strings.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome1 = "Kaido"; //String constant pool, String interning
        String nome2 = "Kaido";
        //strings literais
        nome1.concat(" das Feras"); //retorna uma nova String com o valor concatenado, mas não altera o valor original
        //pois as strings são imútaveis
        System.out.println(nome1);
        System.out.println(nome1 == nome2); //por tanto, enquanto nome1 não referenciar outra String completamente nova
        //irá continuar sendo igual  a nome 2
        nome1 = nome1.concat(" das Feras");
        String nome3 = new String("Kaido"); //muito feio
        System.out.println(nome3 == nome2); //retorna falso, pois o método para criar as variáveis de referẽncia são diferentes
        //string objeto
        System.out.println(nome3.intern() == nome2); //comparação correta (ainda é melhor usar o equals pra isso, tem menos ambiguidade)
    }
}
