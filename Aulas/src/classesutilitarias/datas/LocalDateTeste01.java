package classesutilitarias.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2025, Month.JANUARY,27);
        System.out.println(date.getYear()+"/"+date.getMonth()+"/"+date.getYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());  //o ano é bissexto?
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date);
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
    }
}
