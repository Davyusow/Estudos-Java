package classesutilitarias.datas;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        DateFormat[] dateformat = new DateFormat[7];
        dateformat[0] = DateFormat.getInstance();
        dateformat[1] = DateFormat.getDateInstance();
        dateformat[2] = DateFormat.getTimeInstance();
        dateformat[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateformat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateformat[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dateformat[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat formatado : dateformat){
            System.out.println(formatado.format(calendario.getTime()));
        }

    }
}
