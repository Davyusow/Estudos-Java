package Introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1,2,3,4,5}; //inicia a varíavel com os valores dentro das chaves
        int[] numeros3 = {1,2,3,4,5};   //uma maneira simplificada da anterior

        for(var Numero:numeros3){   //estrutura do foreach
            System.out.println(Numero);
        }
    }
}
