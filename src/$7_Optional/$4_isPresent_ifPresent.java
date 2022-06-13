package $7_Optional;

import java.util.Optional;
import java.util.function.Consumer;

public class $4_isPresent_ifPresent {
    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("hello Optional");
        System.out.println(optional.isPresent());

        //ifPresent
        optional.ifPresent(s -> System.out.println(s));
    }
}
