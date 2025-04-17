package Introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double total = 30000;
        for (int parcela =(int) total;parcela >= 1; parcela--) {
            double valorDaParcela = total / parcela;
            if(valorDaParcela < 1000){
                continue;   //o continue reseta o for ignorando as linhas debaixo
            }
            System.out.printf("Parcela %d R$%.2f\n",parcela,valorDaParcela);
        }
    }
}
