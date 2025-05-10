package classesutilitarias.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2004, Month.JUNE,27,5,59);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));   //aqui o chronounit ta convertendo pra outra grandeza
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));
        System.out.println(ChronoUnit.HOURS.between(aniversario,now));
    }
}
