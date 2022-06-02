package newDateTimeAPI;

import java.time.LocalDate;

public class First_LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plusDays(300));
    }
}
