package task1;
import sun.util.resources.LocaleData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class ExampleLimit {
    public static void main(String[] args) {
       Random random = new Random();
       random.ints().limit(5).forEach(System.out::println);
       random.ints().limit(5).sorted().forEach(System.out::println);
        System.out.println();

        List<Integer> list = Arrays.asList(4,38,0,-8,-100,300,23,45,1,6);
        IntSummaryStatistics stats = list.stream()
                .mapToInt((value) -> value).summaryStatistics();
        System.out.println("The maximum number in List : " + stats.getMax());
        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(today);

        DayOfWeek nameDayOfWeek = today.getDayOfWeek();
        System.out.println(nameDayOfWeek);

        LocalDate addOneWeek = today.plusWeeks(1);
        System.out.println(addOneWeek);
        LocalDate firstMonday = today.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println("The first Monday of current month is " + firstMonday);

    }
}
