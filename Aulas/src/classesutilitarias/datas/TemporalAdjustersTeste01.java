package classesutilitarias.datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now.plusDays(20); //adiciona 20 dias
        now = now.withDayOfMonth(20); //seta o dia do mês como 20
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        now = now.with(ChronoField.DAY_OF_MONTH,20); //o chronofield é o temporal adjuster ness situação
        System.out.println(now);
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)); //retorna o sábado anterior
        System.out.println(now);
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
    }
}
