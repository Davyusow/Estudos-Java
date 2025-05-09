package Aula04;

public class Arrays {
    public static void main(String[] args) {
        int[] valores = new int[1]; //arrays são estáticos, não podendo alterar o tamanho
        int valores2[]; //cria um array com tamanho indefinido
        int valores3[] = {1,2,3,4,5}; //cria um array com tamanho implícito, declarando os valores
        //se tentar acessar uma posição fora do array, irá ocorrer uma exceção

        try {
            valores3[8] = 1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("deu pau");
        }

        for(int i : valores3){
            System.out.println(i-1);
        }
        System.out.println("-----------");
        for(int novos : valores3){
            System.out.println(novos);
        }

    }
}
