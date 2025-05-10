package classesutilitarias.datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime now2Anos = LocalDateTime.now().plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime nowTime7Hours = LocalTime.now().minusHours(7);

        Duration.between(now,now2Anos);
        Duration.between(nowTime,now2Anos);


        Duration duracao = Duration.between(now,now2Anos);  //calcula o tempo entre duas medidas de tempo que trabalhem com segundos e nano segundos
        Duration duracao2 = Duration.between(nowTime,nowTime7Hours);

        System.out.println(duracao);
        System.out.println(duracao2);
    }
}
