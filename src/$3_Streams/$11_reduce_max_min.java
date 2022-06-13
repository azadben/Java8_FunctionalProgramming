package $3_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $11_reduce_max_min {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        System.out.println("findMaxValue: "+findMaxValue(integerList));
        System.out.println("findMaxValue with Empty list: "+ findMaxValue(Arrays.asList()));

        System.out.println("*************************************************************************");

        System.out.println("findMixValue with Empty list: "+ findMixValue(integerList));
        System.out.println("findMixValue with Empty list: "+ findMixValue(Arrays.asList()));

    }
    public static int findMaxValue(List<Integer> integerList)
    {
        /**
        Integer result = integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
        return result;
         */

        /**
         Optional<Integer> optionalInteger  = integerList.stream()
         .reduce((x, y) -> x > y ? x : y);
         return optionalInteger.get();
         */

        Optional<Integer> optionalInteger = integerList.stream()
                .reduce(Integer::max);
        if(optionalInteger.isPresent())
            return optionalInteger.get();
        else
            return -1;
    }
    public static int findMixValue(List<Integer> integerList)
    {
        Optional<Integer> minValue = integerList.stream()
                .reduce((x, y) -> x < y ? x : y);

        if (minValue.isPresent())
            return minValue.get();
        else
            return Integer.MIN_VALUE;
    }
}
