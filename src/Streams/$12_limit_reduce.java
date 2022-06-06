package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $12_limit_reduce {
    /**
     * limit(n) - will process the first n elements only
     * skip(n) - will skips the first n elements
     * */

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitResult1 = limitSum(integers);
        System.out.println("limitSum: "+limitResult1.get());

        Optional<Integer> limitResult2 = limitSum(Arrays.asList());
        System.out.println("limitSum: "+limitResult2);

/*************************************************************************************************************/

        Optional<Integer> skipResult1 = skipSum(integers);
        System.out.println("skipSum: "+skipResult1.get());

        Optional<Integer> skipResult2 = skipSum(Arrays.asList());
        System.out.println("skipSum: "+skipResult2);
    }
    public static Optional<Integer> limitSum(List<Integer> integers)
    {
        return integers.stream()
                .limit(2)
                .reduce((x,y)-> x+y);
    }
    public static Optional<Integer> skipSum(List<Integer> integers)
    {
        return integers.stream()
                .skip(2)
                .reduce((x,y)-> x+y);
    }
}
