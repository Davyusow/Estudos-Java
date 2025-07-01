package javacore.classesinternas.teste;

public class ClassesExternasTeste03 {
    private String nome = "Ciclano";

    static class Aninhada{ //dessa maneira consegue apenas acessar atributos estáticos da classe externa
        private String nome = "Fulano";
        public void print(){
            System.out.println(new ClassesExternasTeste03().nome + " e "+ nome);
        }
    }

    public static void main(String[] args) {
        Aninhada aninhada = new Aninhada();
        aninhada.print();
    }
}
