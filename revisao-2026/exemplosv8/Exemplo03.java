import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exemplo03 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Olá, Mundo!");
                }
        }).run();   // A coisa mais feia que já vi na vida

        new Thread(() -> System.out.println("Olá, Mundo!")).run(); //A mesma coisa em uma só linha 🙂‍↔️

        // ## Outro Exemplo com swing:
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    System.out.println("Olá Munndo mais uma vez!");
			}

        }); // Tudo isso pra um botão fazer algo

        JButton button2 = new JButton();
        button2.addActionListener(e -> System.out.println("Olá Munndo mais uma vez!")); // E mais uma vez a mesma coisa 🙂‍↔️

        // SAM - Single Abstract Method
        // Isso funciona pra qualquer interface que possua apenas um método abstrato
        // Normalmente interfaces assim possuem a notação @FunctionalInterface
    }
}
