package $8_Default_StaticMethods.$3_Multiplier;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5);
        Multiplier multiplier = new MultiplierImpl();
        MultiplierImpl multiplierImpl = new MultiplierImpl();


        System.out.println("Result is: "+multiplier.multiply(integerList));
        System.out.println("default method size is: "+multiplier.size(integerList));
        System.out.println("static method isEmpty is: "+Multiplier.isEmpty(integerList));

    }
}
