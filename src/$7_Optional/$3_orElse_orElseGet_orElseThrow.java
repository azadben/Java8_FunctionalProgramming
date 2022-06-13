package $7_Optional;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Optional;

public class $3_orElse_orElseGet_orElseThrow {
    public static void main(String[] args) {
        System.out.println("orElse: "+optionalOrElse());

        System.out.println("orElseGet: "+optionalOrElseGet());

        System.out.println("optionalOrElseThrow: "+optionalOrElseThrow());
    }

    //orElse
    public static String optionalOrElse()
    {
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String orElse = studentOptional.map(Student::getName).orElse("Default");

        return orElse;
    }

    //orElseGet
    public static String optionalOrElseGet()
    {
        // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String orElseGet = studentOptional.map(Student::getName).orElseGet(() -> "Default"); //provide supplier to orElseGet

        return orElseGet;
    }

    //OrElseThrow - throws exception
    public static String optionalOrElseThrow()
    {
        // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String orElseThrow = studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No Data Available")); //provide supplier to orElseGet

        return orElseThrow;
    }

}
