package $9_newDateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class $6_Duration {
    /**
     Duration - used to calculate the difference between the time objects such as LocalTime and LocalDateTime

     */
    public static void main(String[] args) {
        LocalTime localTime1=LocalTime.of(7,20);
        LocalTime localTime2=LocalTime.of(8,20);

        long until = localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println("until: "+until);

        Duration between = Duration.between(localTime1, localTime2);
        System.out.println("between: "+between.toMinutes());

        Duration ofHours = Duration.ofHours(10);
        System.out.println("to Minutes: "+ofHours.toMinutes());



    }
}
