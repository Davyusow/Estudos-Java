package javacore.excecao.error.teste;
//erro faz com que o programa pare em tempo de execução
public class StackOverflowTeste01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
