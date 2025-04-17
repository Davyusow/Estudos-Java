package introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000
        double salario = 6000.00D;
        String mensagemDoar = "Eu vou doar R$500,00";
        String mensagemNaoDoar = "Eu não posso doar porquê não tenho condições, mas terei!";
        String resultado = (salario>5000) ?  mensagemDoar : mensagemNaoDoar;
        //operador ternário:
        // variável = (condição) ? valorSeVerdadeiro : valorSeFalso;
        short idade = 20;
        String categoria = (idade < 15) ? "Categoria Infantil" : (idade >= 15 && idade < 18) ? "Categoria Juvenil" : "Categoria Adulto"; 
        //Apesar de ser possível usar else if desta maneira no operador ternário
        //não é recomendado por dificultar a leitura
        System.out.println(resultado);
    }
}
