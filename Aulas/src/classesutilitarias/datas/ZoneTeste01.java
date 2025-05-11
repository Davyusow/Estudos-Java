package classesutilitarias.datas;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS; //um map é uma coleção de chave e valor
        //semelhante aos dicionários do python
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime = 
    }
}
