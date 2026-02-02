package java13;

public class Exemplos {

    private enum DIA_SEMANA {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    };

    public static void main(String[] args) {
        var texto = switchTradicional(DIA_SEMANA.DOMINGO);
        System.out.println(texto);
        textBlock();
    }

    private static String switchTradicional(DIA_SEMANA dia) {

        return switch (dia) {
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                yield "Dia útil"; // retorna o valor dentro do switch, e da um break implícito
            case SABADO:
            case DOMINGO:
                yield "Final de semana";
            default:
                yield "dia inválido!";
        };
    }

    private static void textBlock() {
        String sql1 = "update products\n" + //
                "    SET quantityINStock = ?\n" + //
                "    ,modifiedDate = ?\n" + //
                "    ,modifiedBy = ?\n" + //
                "WHERE productCode = ?\n" + //
                "";

        // Novo Bloco de texto
        // útil para jsons e scripts sql como este
        String sql = """
                update products
                    SET quantityINStock = ?
                    ,modifiedDate = ?
                    ,modifiedBy = ?
                WHERE productCode = ?
                """;
        System.out.println(sql);
    }

}
