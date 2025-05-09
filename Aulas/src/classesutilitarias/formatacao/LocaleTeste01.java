package classesutilitarias.formatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale local = new Locale("pt","BR");   //iso 639
        //Locale faz a localização para uma formatação
        Calendar calendario = Calendar.getInstance();
        DateFormat formatado = DateFormat.getDateInstance(DateFormat.FULL,local);
        System.out.println("Brasil : "+formatado.format(calendario.getTime()));
        System.out.println(local.getDisplayCountry());
    }
}
