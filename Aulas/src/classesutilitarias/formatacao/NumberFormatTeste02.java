package classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
        NumberFormat[] Fnumero = new NumberFormat[4];
        Locale local = Locale.getDefault();
        Locale localJP = Locale.JAPAN;

        Fnumero[0] = NumberFormat.getCurrencyInstance(Locale.US);
        Fnumero[1] = NumberFormat.getCurrencyInstance(local);
        Fnumero[2] = NumberFormat.getCurrencyInstance(localJP);
        Fnumero[3] = NumberFormat.getCurrencyInstance(Locale.ITALY);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : Fnumero) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String numero = "13123.11";
        try {
            System.out.println(Fnumero[1].parse(numero));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
