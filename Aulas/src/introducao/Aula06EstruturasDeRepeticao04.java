package introducao;

public class Aula06EstruturasDeRepeticao04 {

    public static void main(String[] args) {
        //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
        //condição: valor da parcela >= 1000
        float valorCarro = 10000;
        /*int parcela = (int)valorCarro / 1000;
        System.out.println("Serão pagas "+parcela+" parcelas");*/
        for (int parcelas = 1;parcelas <= valorCarro;parcelas++) {
            float valorParcela = valorCarro / parcelas;
            if (valorParcela >= 1000) {
                System.out.printf("Parcela %d R$ %.2f\n",parcelas,valorParcela);
            }else{
                break;
            }
        }
    }
}
