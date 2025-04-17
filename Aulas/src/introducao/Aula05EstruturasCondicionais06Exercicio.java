package introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 domingo
        byte dia = 7;
        switch(dia){
            case 2,3,4,5,6:
                System.out.println("Dia útil!");
                break;
            case 1,7:
                System.out.println("Fim de semana!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
