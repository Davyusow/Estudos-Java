package classesutilitarias.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //um map é uma coleção de chave e valor
        //semelhante aos dicionários do python
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        LocalDateTime now = LocalDateTime.now();
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);

        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime =now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

    }
}
