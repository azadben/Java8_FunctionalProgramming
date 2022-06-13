package $4_NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class $2_range_rangeClosed_count_foreach {
    /**
     *  Ranges
     * IntStream.range(1,50) 1 to 49
     * IntStream.rangeClosed(1,50) 1 to 50
     * */

    public static void main(String[] args) {
        long rangeCount = IntStream.range(1, 50).count();
        long rangeClosedCount = IntStream.rangeClosed(1, 50).count();
        System.out.println("rangeCount: "+rangeCount+"\n"+"rangeClosedCount: "+rangeClosedCount);

        System.out.println("IntStream.rangeClosed: ");
        IntStream.rangeClosed(1,50).forEach(num->System.out.print(num+", "));

        System.out.println();
        System.out.println("IntStream.range: ");
        IntStream.range(1,50).forEach(num->System.out.print(num+", "));


        System.out.println();
        System.out.println("LongStream.rangeClosed: ");
        LongStream.rangeClosed(1,50).forEach(num->System.out.print(num+", "));


        System.out.println();
        //DoubleStream doesn't support range and rangeClosed method, so we have to use InsStream
        System.out.println("asDoubleStream.rangeClosed: ");
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(num->System.out.print(num+", "));
    }
}
