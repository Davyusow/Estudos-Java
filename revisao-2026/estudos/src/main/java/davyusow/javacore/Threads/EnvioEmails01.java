package davyusow.javacore.Threads;

import javax.swing.JOptionPane;

import davyusow.javacore.Threads.Model.Membros;
import davyusow.javacore.Threads.service.EnvioEmailsService;

public class EnvioEmails01 {
    public static void main(String[] args) {
        Membros membros = new Membros();
        Thread thread01 = new Thread(new EnvioEmailsService(membros), "Jiraya");

        Thread thread02 = new Thread(new EnvioEmailsService(membros), "Kakashi");

        thread01.start();
        thread02.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com o seu e-mail");
            if (email == null || email.isEmpty()) {
                membros.fechar();
                break;
            }
            membros.addEmailDeMembro(email);
        }
    }
}
