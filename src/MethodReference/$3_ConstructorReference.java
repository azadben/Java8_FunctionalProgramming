package MethodReference;

import Lambda_FunctionalInterface.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class $3_ConstructorReference {
    static Supplier<Student> studentSupplier=Student::new;

    /**
     *  this is wrong bez, no constructor is present with 1 argument, also that argument has to be of type Student
     *  static Function<Student,Student> function=Student::new;
     */

    static Function<String,Student> function=Student::new;

    public static void main(String[] args)
    {
        System.out.println(studentSupplier.get());

        System.out.println(function.apply("Bose"));
    }


}
