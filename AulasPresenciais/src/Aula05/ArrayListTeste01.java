package Aula05;

import java.util.ArrayList;

public class ArrayListTeste01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Pedro");
        System.out.println(nomes);
        System.out.println(nomes.get(0));
        nomes.remove("Pedro");
        System.out.println(nomes);
        nomes.add("Alan");
        nomes.add("Antônio");
        Pessoa p1 = new Aluno("1234","fulano",12,12,12,"123123","123123");
        Aluno p2 = new Aluno("1234","fulano",12,12,12,"123123","123123");

        var teste1 = ((Aluno)p1).getMatricula();


        var teste2 = p2.getMatricula();


        Pessoa p3 = new Professor("","",12,12,12,"asd","asd",123);
        var teste3 = ((Professor)p3).getArea() ; //casts com super classes
        //((tipo herdado)variável).método(argummentos)
        System.out.println("Foi : "+teste1);
        System.out.println("Foi : "+teste2);
        System.out.println("Foi : "+teste3);

        if( p1 instanceof Aluno){   //instanceof é um operador booleano que verifica se o objeto é uma instância de uma classe
            System.out.println("p1 é Aluno");
        }else if( p1 instanceof Pessoa){
            System.out.println("p1 é Pessoa");
        }

        for(String nome:nomes){

            System.out.println(nome);
        }

    }
}
