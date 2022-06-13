package $4_NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $4_Boxing_UnBoxing {

    /** Boxing() -> converting a Primitive type to Wrapper class type
     *      eg- int to Integer
     *
     *  UnBoxing() -> converting a Wrapper class type to Primitive type
     *       eg- Integer to int
     * */
    public static void main(String[] args) {
        List<Integer> boxing = boxing();
        System.out.println("boxing: "+boxing);

        System.out.println("Unboxing: "+unBoxing(boxing));
    }
    public static List<Integer> boxing()
    {
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unBoxing(List<Integer> integerList)
    {
        return integerList.stream()
                .mapToInt(num-> num.intValue())
                //.mapToInt(Integer::intValue)    same as above
                .sum();
    }
}
