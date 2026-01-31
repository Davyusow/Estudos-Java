package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Aula04 {

        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

                var coleta = list.stream().collect(
                                () -> new ArrayList<>(),
                                (l, e) -> l.add(e),
                                (l1, l2) -> l1.addAll(l2));

                System.out.println(coleta);
                // to list
                // Retornna o stream como uma lista
                List<Integer> collect = list.stream()
                                .filter((e) -> e % 2 == 0)
                                .collect(Collectors.toList());

                System.out.println(collect);

                String joining = list.stream().map(n -> n.toString()).collect(Collectors.joining());
                System.out.println(joining);

                Double media = list.stream().collect(Collectors.averagingInt(n -> n.intValue()));
                System.out.println(media);

                IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(n -> n.intValue()));
                System.out.println(stats.getAverage());
                System.out.println(stats.getCount());
                System.out.println(stats.getMax());
                System.out.println(stats.getMin());
                System.out.println(stats.getSum());

                var collect2 = list.stream().filter((n) -> n % 2 == 0)
                                .collect(Collectors.counting());
                System.out.println(collect2);

        }
}
