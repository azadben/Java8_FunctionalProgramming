package Lambda_FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class $11_BinaryOperator_BiFunction {

    public static void main(String[] args) {
        //if input and output are same type
        BinaryOperator<Integer> binaryOperator=(num1,num2)->{return num1*num2;};
        System.out.println(binaryOperator.apply(100,20));


        Comparator<Integer> comparator=(num1,num2)-> num1.compareTo(num2);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        Integer res = maxBy.apply(100, 20);
        System.out.println("maxBy: "+res);


        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        Integer res1 = minBy.apply(100, 20);
        System.out.println("minBy: "+res1);
    }

}
