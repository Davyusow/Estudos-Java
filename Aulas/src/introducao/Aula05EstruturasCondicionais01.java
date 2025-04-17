package introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        if(true){
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
        if(true) System.out.println("Dentro do if de novo só que mais estiloso e menos prático");
        //
        int idade = 20;
        if(idade > 17){
            System.out.println("Você pode comprar bebida alcoólica");
        }
        if(idade <= 17){
            System.out.println("Você não pode comprar bebida alcoólica");
        }
        boolean passe = false;
        if (passe == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        boolean isMaiorDeIdade = idade >= 18;
        if(isMaiorDeIdade){
            System.out.println("Você pode comprar bebida alcoólica");
        }else{
            System.out.println("Você não pode comprar bebida alcoólica");
        }
    }   
}
