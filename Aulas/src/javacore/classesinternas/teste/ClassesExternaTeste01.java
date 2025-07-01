package javacore.classesinternas.teste;

public class ClassesExternaTeste01 {
    private String nome = "Fulano de tal";

    class ClasseInterna1{
        public void printAtributoClasseExterna(){
            System.out.println(nome);   //pode manipular os atributos da classe externa a ela
            System.out.println(this);   //se referência a classe "ClasseInterna1"
        }
    }

    public static void main(String[] args) {
        ClassesExternaTeste01 classeInterna = new ClassesExternaTeste01();
        ClasseInterna1 classeInterna1 = classeInterna.new ClasseInterna1();
        classeInterna1.printAtributoClasseExterna();

    }
}
