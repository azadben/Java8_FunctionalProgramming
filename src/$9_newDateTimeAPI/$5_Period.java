package $9_newDateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class $5_Period {
    /**
     Period - used to represent Period of Time(mainly used to calculate difference between two dates)
     */

    public static void main(String[] args) {

        Period until = LocalDate.of(1997, 8, 15).until(LocalDate.now()) ;
        System.out.println("Until Years: "+until.getYears()+" Months: "+until.getMonths()+" Days: "+until.getDays());




        Period between = Period.between(LocalDate.of(1997, 8, 15), LocalDate.now());
        System.out.println("Years: "+between.getYears()+" Months: "+between.getMonths()+" Days: "+between.getDays());
        System.out.println("toTotalMonths: "+between.toTotalMonths());

    }
}
