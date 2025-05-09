package classesutilitarias.datas;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        LocalTime hora = LocalTime.of(10,0);
        System.out.println(agora);
        System.out.println(hora);
        System.out.println(hora.getHour());
        System.out.println(hora.getMinute());
        System.out.println(hora.getSecond());
        System.out.println(hora.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MAX);
    }
}
