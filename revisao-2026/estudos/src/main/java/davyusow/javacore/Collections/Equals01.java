package davyusow.javacore.Collections;

import davyusow.javacore.Collections.model.Celular;

public class Equals01 {
    public static void main(String[] args) {
        String nome = "Beltrano da Silva";
        String nome2 = "Beltrano da Silva";
        String nome3 = new String("Beltrano da Silva");

        IO.println(nome == nome2);
        IO.println(nome == nome3);
        IO.println(nome.equals(nome3));

        Celular cel01 = new Celular("000-1110-2220-3333", "Motorola");
        Celular cel02 = new Celular("000-1110-2220-3333", "Motorola");
        Celular cel03 = new Celular("000-1110-2220-3333", "Motorola");

        IO.println("Reflexivo: a != null ^ a == a -> %b "
                .formatted(cel01.equals(cel01)));

        IO.println("Simétrico: a == b (%b) ^ b == a (%b) -> true ".formatted(
                cel01.equals(cel02), cel02.equals(cel01)));

        IO.println("Transitivo: a == b (%b) ^ b == c (%b) -> a == c (%b)"
                .formatted(cel01.equals(cel02), cel02.equals(cel03), cel01.equals(cel03)));

        IO.println("Consistente: a != null -> a == null é false (%b)"
                .formatted(cel01.equals(null)));

        IO.println(cel01.hashCode());
        IO.println(cel02.hashCode());
        IO.println(cel03.hashCode());

        // mais performático, mas pode não ser necessariamente igual 
        IO.println("cel01 é igual a cel02?: %b"
            .formatted(cel01.hashCode() == cel02.hashCode())
        );

    }
}
