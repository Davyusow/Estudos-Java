package classesutilitarias.wrappers.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {
        byte bytePrimitivo = 20;
        short shortPrimitivo = 200;
        int intPrimitivo = -500;
        long longPrimitivo = 10000000;
        float floatPrimitivo = 20.5F ;
        double doublePrimitivo = 30.75D;
        char charPrimitivo = 'f';
        boolean booleanPrimitivo = false ;


        //Passam a ser objetos
        //podendo passar os valores por referência para parâmetros de outras classes
        //úteis em collections e ArrayLists
        //se não for necessário, é preferível usar os tipos primitivos
        Byte byteWrapper = 20;  //quando você transforma um tipo primitivo em wrapper como nestes exemplos, isso é chamado de boxing, nesse caso mais específico, autoboxing
        Short shortWrapper = 200;
        Integer intWrapper = -500;
        Long longWrapper = 10000000L;
        Float floatWrapper = 20.5F ;
        Double doubleWrapper = 30.75D;
        Character charWrapper = 'f';
        Boolean booleanWrapper = false ;

        int unboxing = byteWrapper; //quando você passa um wrapper para um tipo primitivo, o transforma em tipo primitivo , isso é chamado de unboxing
        unboxing = byteWrapper.byteValue(); //é o que esta acontecendo implicitamente no comando de cima
        Integer intExemplo01 = Integer.parseInt("123456789") ; //retira ao valor inteiro de uma String
        // Integer intExemplo02 = new Integer("18"); //isso aqui é a coisa mais feia que você poderia fazer
        Float floatExemplo04 = Float.parseFloat("50000.00"); //todos os wrappers menos o Character possuem parse
        Boolean booleanExemplo05 = Boolean.parseBoolean("TrUe");    //ele nativamente deixa todos os caracteres diminutivos
        System.out.println(booleanExemplo05);
        System.out.println(Character.isAlphabetic(charWrapper));
        System.out.println(Character.isDefined(charWrapper));
        System.out.println(Character.isDigit(charWrapper));
        System.out.println(Character.isEmoji(charWrapper));
        System.out.println(Character.isLetter(charWrapper)); //etc...
        System.out.println(Character.toLowerCase(charWrapper));
        System.out.println(Character.toUpperCase(charWrapper));
        System.out.println(Character.toString(charWrapper));

    }
}
