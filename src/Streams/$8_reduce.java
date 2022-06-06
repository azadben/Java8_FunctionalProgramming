package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class $8_reduce {
    /**
     * This is a terminal operation, used to reduce the contents of a stream to a single value...
     *
     *  it takes 2 parameters as input
     *  1. default or initial value
     *  2. BinaryOperator<T>
     *
    * */
    public static void main(String[] args)
    {
        List<Integer> integers= Arrays.asList(1,3,5,8,10);

        System.out.println("performMultiplication: ");
        System.out.println(performMultiplication(integers));

        System.out.println("performAddition: ");
        System.out.println(performAddition(integers));

        System.out.println("performSubtraction: ");
        System.out.println(performSubtraction(integers));

        System.out.println("performAdditionWithoutIdentity: Optional");
        Optional<Integer> optionalInteger = performAdditionWithoutIdentity(integers);
        System.out.println(optionalInteger.isPresent());
        System.out.println(optionalInteger.get());

        System.out.println("Empty: Optional");
        Optional<Integer> optionalInteger1 = performAdditionWithoutIdentity(new ArrayList<>());
        if(optionalInteger1.isPresent())
            System.out.println(optionalInteger1.get());
        else
            System.out.println("No value contained by optional");
    }

    public static int performMultiplication(List<Integer> integerList)
    {
        //BinaryOperator<Integer> binary=((num1,num2)-> num1*num2);
        return integerList.stream()
                .reduce(1,(num1,num2)-> {
                    System.out.println("num1: "+num1+" num2: "+num2);
                    return num1*num2;
                });

        /**
         * num1: 1(identity) ,   num2: 1(from stream)
         * num1: 1(num1*num2) ,  num2: 3(from stream)
         * num1: 3(num1*num2) ,  num2: 5(from stream)
         * num1: 15(num1*num2) , num2: 8(from stream)
         * num1: 120(num1*num2) ,num2: 10(from stream)
         * return 120*10
         * */
    }
    public static int performAddition(List<Integer> integerList)
    {
        //BinaryOperator<Integer> binary=((num1,num2)-> num1*num2);
        return integerList.stream()
                .reduce(0,(num1,num2)-> {
                   // System.out.println("num1: "+num1+" num2: "+num2);
                    return num1+num2;
                });
    }
    public static int performSubtraction(List<Integer> integerList)
    {
        //BinaryOperator<Integer> binary=((num1,num2)-> num1*num2);

        return integerList.stream()
                .reduce(0,(num1,num2)-> {
                    //System.out.println("num1: "+num1+" num2: "+num2);
                    return Math.abs(num1-num2);
                });
    }
    public static Optional<Integer> performAdditionWithoutIdentity(List<Integer> integerList)
    {
        //BinaryOperator<Integer> binary=((num1,num2)-> num1*num2);
        Optional<Integer> optionalInteger = integerList.stream()
                .reduce((num1, num2) -> {
                    return num1 + num2;
                });
        return optionalInteger;
    }
}
