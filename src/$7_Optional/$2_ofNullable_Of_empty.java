package $7_Optional;

import java.util.Optional;

public class $2_ofNullable_Of_empty {

    /**
     Optional.of : Used to ensure that there is no null, if null is entered, nullPointException is thrown
     Use it when there's no null present

     Optional.ofNullable : takesCare of nullPointException, it is flexible to use

     */
    public static void main(String[] args)
    {
        System.out.println("ofNullable: "+ofNullable());

        System.out.println("of: "+of());

        System.out.println("empty: "+empty());
    }
    public static Optional<String> ofNullable()
    {
        Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }
    public static Optional<String> of()
    {
        Optional<String> stringOptional = Optional.of(null);
        return stringOptional;
    }
    public static Optional<String> empty()
    {
        return Optional.empty();
    }

}
