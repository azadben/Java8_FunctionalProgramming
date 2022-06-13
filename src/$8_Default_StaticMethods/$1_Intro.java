package $8_Default_StaticMethods;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class $1_Intro {

    /**
     An interface in Java is similar to class but, it contains only abstract methods and fields which are final and static.

     Since Java8 static methods and default methods are introduced in interfaces.

     Default Methods - Unlike other abstract methods these are the methods can have a default implementation.
     If you have default method in an interface,
     it is not mandatory to override (provide body) it in the classes that are already implementing this interface.

     Static methods - They are declared using the static keyword and will be loaded into the memory along with the interface.
     You can access static methods using the interface name.
     If your interface has a static method you need to call it using the name of the interface, just like static methods of a class.

     Difference between static and default methods −
     Calling the method
     You can call a static method using the name of an interface.
     To call a default method you need to use the object of the implementing class.

     Overriding the method
     If you want, you can override a default method of an interface from the implementing class.
     */

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");

        //before java 8
        Collections.sort(stringList);
        System.out.println("sorted usein Collections.sort() method: "+stringList);

        //java 8
        stringList.sort(Comparator.naturalOrder()); //sort in ascending order
        System.out.println("sorted useing List.sort() method: "+stringList);

        stringList.sort(Comparator.reverseOrder()); //sort in ascending order
        System.out.println("sorted useing List.sort(Comparator.reverseOrder()) method: "+stringList);
    }
}
