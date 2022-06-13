package $4_NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $5_mapToObj_mapToLong_mapToDouble {
    /**
     * mapToObj() -> converts a each element numeric stream to some Object
     * mapToLong() -> converts a each element numeric stream to long Stream
     * mapToDouble() -> converts a each element numeric stream to long Stream
     * */
    public static void main(String[] args) {
        System.out.println("mapToObj: "+mapToObj());

        System.out.println("mapToLong: "+mapToLong());

        System.out.println("mapToDouble: "+mapToDong());
    }
    public static List<Integer> mapToObj()
    {
        return IntStream.rangeClosed(1,50)
                .mapToObj(num-> new Integer(num))
                .collect(Collectors.toList());
    }
    public static Long mapToLong()
    {
        return IntStream.rangeClosed(1,50)
                .mapToLong(i->i)
                .sum();
    }
    public static Double mapToDong()
    {
        return IntStream.rangeClosed(1,50)
                .mapToDouble(i->i)
                .sum();
    }
}
