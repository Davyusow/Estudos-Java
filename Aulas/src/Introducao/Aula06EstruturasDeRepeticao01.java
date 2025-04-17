package Introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        System.out.println("While: ");
        
        while(count < 10){  //while verifica e depois roda
            System.out.println(++count);
        }
        count = 0;

        System.out.println("do while: ");
        do {    //do while roda e depois verifica
            System.out.println(++count);
        } while (count < 10);

        System.out.println("for: ");
        for(int i = 1;i<=10;i++){ //for roda contando a variável do primeiro argumento, enquanto o segundo argumento for verdadeiro com o passo do terceiro argumento
            System.out.println(i);
        }
    }
}
