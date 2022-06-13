package $8_Default_StaticMethods.$3_Multiplier;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integersList);

    default int size(List<Integer> integersList)
    {
        System.out.println("Inside Multiplier Interface");
        return integersList.size();
    }

    static boolean isEmpty(List<Integer> integersList)
    {
        return integersList.size()>0;
    }
}
