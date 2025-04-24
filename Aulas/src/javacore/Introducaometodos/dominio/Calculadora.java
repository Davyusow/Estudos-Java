package javacore.Introducaometodos.dominio;

public class Calculadora {
    public void soma(){
        System.out.println(10+10);
    }
    public void subtrai(){
        System.out.println(21-2);
    }
    public void multiplica(int n1,int n2){
        System.out.println(n1*n2);
    }
    public double divide(double n1,double n2){
        if(n2 == 0){return 0;}
        return n1/n2;
    }
    public void imprimeDivisao(double n1,double n2){
        if(n2==0){
            System.out.println("Não existe divisão por zero!");
        }else{
            System.out.println(divide(n1,n2));
        }
    }
    public void alteraDoisNumeros(int n1,int n2){
        n1 = 99;
        n2 = 33;
        System.out.printf("\nDentro do alterando dois números:\nn1 = %d\nn2 = %d\n",n1,n2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int cont:numeros){
            soma+=cont;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){ //os 3 pontos faz com que transforme todos os inteiros inseridos em um array
        //porém o varArgs pode ser apenas o último valor dos argumentos, ex: somaVarArgs(String opcao, int sinal,int... numeros);
        int soma = 0;
        for(int cont:numeros){
            soma+=cont;
        }
        System.out.println(soma);
    }
}
