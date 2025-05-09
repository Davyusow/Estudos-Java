package classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        NumberFormat[] Fnumero = new NumberFormat[4];
        Locale local = Locale.getDefault();
        Locale localJP = Locale.JAPAN;

        Fnumero[0] = NumberFormat.getInstance(Locale.US);
        Fnumero[1] = NumberFormat.getInstance(local);
        Fnumero[2] = NumberFormat.getInstance(localJP);
        Fnumero[3] = NumberFormat.getInstance(Locale.ITALY);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : Fnumero) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
