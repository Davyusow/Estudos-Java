package classesutilitarias.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime dataEHora = LocalDateTime.of(LocalDate.of(2025, Month.FEBRUARY,27), LocalTime.of(10,0));
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(dataEHora);
        System.out.println(agora);
    }
}
