package $8_Default_StaticMethods.$3_Multiplier;

import java.util.List;

public class MultiplierImpl implements Multiplier {

    @Override
    public int multiply(List<Integer> integersList) {
        return integersList.stream()
                .reduce(1,(num1,num2)-> num1*num2);
    }

    @Override
    public int size(List<Integer> integersList)
    {
        System.out.println("Inside MultiplierImpl Interface");
        return integersList.size();
    }

    public int FirstElement(List<Integer> integersList)
    {
        System.out.println("FirstElement: ");
        return integersList.get(0);
    }
}
