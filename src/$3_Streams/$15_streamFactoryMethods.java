package $3_Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class $15_streamFactoryMethods {
    /** Streams API - Factory methods Of(), generate() and iterate()
     * 1. Of() - creates a stream of values passed to this method
     * eg: Stream<String> stringStream=Stream.Of("julie","ben","kevin");
     *
     * 2. generate() and iterate() - are used to create infinite stream
     * eg: Stream.iterate(1,x->x*2) 1*2,2*2,4*2,8*2 ...
     * eg: Stream.supplier(<Supplier>)
     * */

    public static void main(String[] args) {
        //Of() eg
        Stream<String> stringStream = Stream.of("julie", "ben", "kevin");
        stringStream.forEach(System.out::println);

        //iterate eg
        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println);


        System.out.println();

        //generate eg
        System.out.println("generate: ");
        Supplier<Integer> integerSupplier=()->{return new Random().nextInt(1,100);};
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);



    }
}
