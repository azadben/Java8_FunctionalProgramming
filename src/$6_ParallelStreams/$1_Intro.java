package $6_ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class $1_Intro {
    public static void main(String[] args) {
        System.out.println("sequentialStream: "+sequentialStream());
        System.out.println("parallelStream: "+parallelStream());



       /***********************************************************************************************************************/

        System.out.println("************ Checking Performance of Sequential and Parallel Streams **********************");

        System.out.println("sequentialStream: "+checkPerformanceResult($1_Intro::sequentialStream,10));
        System.out.println("parallelStream: "+checkPerformanceResult($1_Intro::parallelStream,10));

    }
    public static int sequentialStream()
    {
        return IntStream.rangeClosed(1,100000) //bydefault sequential stream
                //.peek(x-> System.out.println(Thread.currentThread().getName()))
                .sum();
    }
    public static int parallelStream()
    {
        return IntStream.rangeClosed(1,100000) //bydefault sequential stream
                .parallel()
               // .peek(x-> System.out.println(Thread.currentThread().getName()))
                .sum();
    }

    //to check performance
    public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes)
    {
        long startTime=System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++)
        {
            supplier.get();
        }
        long endTime=System.currentTimeMillis();
        return endTime-startTime;
    }
}
