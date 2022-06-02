package newDateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Third_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.of(2130, 1, 1);
        LocalTime time = LocalTime.of(01, 01, 01);
        LocalDateTime userLocalDateTime = LocalDateTime.of(date, time);
        System.out.println("userLocalDateTime: "+userLocalDateTime);

        LocalDateTime user1LocalDateTime = LocalDateTime.of(2010, 01, 1, 9, 10, 00);
        System.out.println("userLocalDateTime: "+user1LocalDateTime);

        /*
        * getting
        * */

        System.out.println("getHour: "+localDateTime.getMinute());
        System.out.println("getYear: "+localDateTime.getYear());
        System.out.println("getDayOfMonth: "+localDateTime.getDayOfMonth());
        System.out.println("DAY_OF_MONTH: "+localDateTime.get(ChronoField.DAY_OF_MONTH));



        /*
        * modify
        * */

        System.out.println(localDateTime.plusYears(10));
        System.out.println(localDateTime.plus(5,ChronoUnit.HOURS));

        System.out.println("withMonth: "+localDateTime.withMonth(10));
        System.out.println("lastDayOfYear: "+localDateTime.with(TemporalAdjusters.lastDayOfYear()));

    }
}
