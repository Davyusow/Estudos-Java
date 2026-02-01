public class MetodosString {

    private enum DIA_SEMANA {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    };

    public static void main(String[] args) {
        novosMetodosString();
        System.out.println(novoSwitch(DIA_SEMANA.QUARTA));
    }

    private static void novosMetodosString() {
        var resultado = "Ola\nMundo!".indent(3);
        System.out.println(resultado);

        resultado = "Olá".transform(s -> s.concat(", Mundo!"));
        System.out.println(resultado);

        resultado = "Olá"
                .transform(s -> s + ", mundo!")
                .transform(String::toUpperCase);
        System.out.println(resultado);
    }

    private static String novoSwitch(DIA_SEMANA dia) {
        // String resultado;

        // // O melhor possível hoje ♥️
        // switch (dia) {
        // case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> resultado = "Dia útil";
        // case SABADO, DOMINGO -> resultado = "Final de semana";
        // default -> {
        // System.out.println("dia inválido!");
        // }
        // }

        // Podemos ainda fazer tudo junto:
        //String resultado = switch (dia) {
        return switch (dia) { // podemos também atribuir a um switch uma variável
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia útil";
            case SABADO, DOMINGO -> "Final de semana";
            default -> "dia inválido";
        };

        // #### O melhor possível antes
        // switch (dia) {
        //     case SEGUNDA:
        //     case TERCA:
        //     case QUARTA:
        //     case QUINTA:
        //     case SEXTA:
        //         resultado = "Dia útil";
        //         break;
        //     case SABADO:
        //     case DOMINGO:
        //         resultado = "Final de semana";
        //         break;
        //     default:
        //         System.out.println("dia inválido!");
        //         break;
        // }

        // O melhor possível um pouco depois
        // switch (dia) {
        //     case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA:
        //         resultado = "Dia útil";
        //         break;
        //     case SABADO, DOMINGO:
        //         resultado = "Final de semana";
        //         break;
        //     default:
        //         System.out.println("dia inválido!");
        //         break;
        // }

    }
}
