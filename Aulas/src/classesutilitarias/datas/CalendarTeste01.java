package classesutilitarias.datas;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();    //classe abstrata
        System.out.println(calendario);
        Date date = calendario.getTime();
        System.out.println(date);
        if( calendario.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        calendario.add(Calendar.DAY_OF_MONTH,2);
        date = calendario.getTime();
        System.out.println(date);
    }
}
