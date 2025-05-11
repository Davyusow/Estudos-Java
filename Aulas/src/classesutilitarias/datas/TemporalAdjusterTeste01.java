package classesutilitarias.datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
       DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
       int addDias = 1;
       switch (dayOfWeek){
           case FRIDAY:
               addDias = 3;
               break;
           case SATURDAY:
               addDias = 2;
               break;
       }
       return temporal.plus(addDias, ChronoUnit.DAYS);
    }
}


public class TemporalAdjusterTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
    }
}
