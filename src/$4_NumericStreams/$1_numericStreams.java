package $4_NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class $1_numericStreams {
    /** Numeric Streams - represents primitive values in a stream
     * 1. IntStream
     * 2. LongStream
     * 3. DoubleStream
     *
     * */

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sumOfNumbers: "+sumOfNumbers(integers));

        System.out.println("sumOfNNumbers: "+sumOfNNumbers());
    }

    public static int sumOfNumbers(List<Integer> integers)
    {
        return integers.stream()
                .reduce(0,(x,y)->x+y);
    }
    public static int sumOfNNumbers()
    {
        return IntStream.rangeClosed(1,6)// 1,2,3,4,5,6
                .sum();
    }
}
