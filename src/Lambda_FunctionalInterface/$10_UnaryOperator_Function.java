package Lambda_FunctionalInterface;

import java.util.function.UnaryOperator;

public class $10_UnaryOperator_Function {
    public static void main(String[] args) {

        // use when I/O and O/P type are same........ its extends Function
        UnaryOperator<String> unaryOperator=s-> s.concat(" developer");
        System.out.println(unaryOperator.apply("java"));



    }
}
