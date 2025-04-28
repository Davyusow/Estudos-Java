package javacore.assiociacao.teste;

import javacore.assiociacao.dominio.Escola;
import javacore.assiociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraiya");
        Professor professor02 = new Professor("Kaito");
        Professor[] professores = {professor01,professor02};
        Escola escola = new Escola("Konoha");
        escola.setProfessores(professores);
        escola.imprime();
    }
}
