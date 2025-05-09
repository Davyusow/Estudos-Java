package classesutilitarias.formatacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("'Recife' dd 'de' MM 'de' yyyy 'às' HH:mm ", Locale.getDefault());
        System.out.println(dateFormat.format(new Date()));

    }
}
