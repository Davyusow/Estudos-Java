package Introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        float salario = 1500.00F;
        float imposto = 0;
        if(salario > 0 && salario < 34712){
            imposto = (9.7F/100) * salario;
        }else if (salario >= 34712 && salario <66507) {
            imposto = (37.35F/100) * salario ;
        }else if (salario >= 66507) {
            imposto = (49.50F/100) * salario;
        }
        System.out.printf("Com o salário de R$%.2f você pagará R$%.2f de impostos!\n",salario,imposto);
        //'printf' faz uma formatação semelhante ao C 
    }
}
