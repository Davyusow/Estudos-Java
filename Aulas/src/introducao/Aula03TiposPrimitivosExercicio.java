package introducao;
/*
 * Descrever a data de recebimento de salário retornando nome, endereço, data e salário na mensagem de saída
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Goku";
        String endereço = "casa do kami";
        float salario = 1000; //zenis
        String data = "27/06/1984";
        System.out.printf("Eu %s, morando no endereço %s, confirmo que recebi o salário %.2f na data %s\n",nome,endereço,salario,data);
        //printf para imprimir com formatação
    }
}
