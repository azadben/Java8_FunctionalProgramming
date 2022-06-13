package $4_NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class $3_AggregateFunctions {
    /**
     *  Aggregate Functions - sum(), max(), min(), average()
     * */
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is: "+sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println("max: "+(max.isPresent() ? max.getAsInt() : -1));

        OptionalLong min = LongStream.rangeClosed(1, 50).min();
        System.out.println("min: "+(min.isPresent() ? min.getAsLong() : -1));

        OptionalDouble average = LongStream.rangeClosed(1, 50).average();
        System.out.println("average: "+(average.isPresent() ? average.getAsDouble(): -1));
    }

}
