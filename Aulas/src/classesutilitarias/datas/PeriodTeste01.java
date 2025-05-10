package classesutilitarias.datas;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.now(),LocalDate.now().plusMonths(2));
        //semelhante à duration, com a diferença que period trabalha com datas
        System.out.println(period);
    }
}
