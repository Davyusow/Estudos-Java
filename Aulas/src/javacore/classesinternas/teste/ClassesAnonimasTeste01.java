package javacore.classesinternas.teste;

class Animal{
    public void andar(){
        System.out.println("Animal andando");
    }
}
//class Cachorro extends Animal{
//    @Override
//    public void andar() {
//        System.out.println("Cachorro andando");
//    }
//}

public class ClassesAnonimasTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.andar();

        Animal cachorro = new Animal(){ //com as chaves é criada uma subclasse de animal,
            //a classe é anônima, pois não tem um nome específico como animal
            @Override
            public void andar() {
                System.out.println("Cachorro andando");
                jump(); //o método pode ser acessado apartir de um método que já existe em Animal
            }

            public void jump(){ //mas este método não pode ser acessado sozinho
                System.out.println("Cachorro pula");

            }
        };
        cachorro.andar();
    }
}
