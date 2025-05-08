package javacore.excecao.runtime.teste.teste;

import javacore.excecao.runtime.teste.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha: ");
        String senhaDigitado = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado) ){
            throw new LoginInvalidoException("Usuário ou senha inválido!");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
