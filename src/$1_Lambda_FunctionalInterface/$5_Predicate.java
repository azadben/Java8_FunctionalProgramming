package $1_Lambda_FunctionalInterface;

import java.util.function.Predicate;

public class $5_Predicate {

    static Predicate<Integer> predicate1=x->{return x%2==0;};
    static Predicate<Integer> predicate2=x->{return x%5==0;};

    public static void main(String[] args) {
        /**
        *           Predicate<Integer> predicate=x->{return x%2==0;};
        *           System.out.println(predicate.test(10));
        * */

        //using default and of predicate
        System.out.println(predicate1.and(predicate2).test(10));
        System.out.println(predicate1.and(predicate2).test(14));

        //using negate
        System.out.println("negate 10: "+predicate1.negate().test(10));
        System.out.println("negate !4: "+predicate2.negate().test(14));

        //using or
        System.out.println(predicate1.or(predicate2).test(10));
        System.out.println(predicate1.or(predicate2).test(14));
        System.out.println(predicate1.or(predicate2).test(7));

        System.out.println(predicate1.or(predicate2).negate().test(7));
    }
}
