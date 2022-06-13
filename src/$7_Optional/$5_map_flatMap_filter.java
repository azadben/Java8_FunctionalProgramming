package $7_Optional;

import $1_Lambda_FunctionalInterface.data.Bike;
import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class $5_map_flatMap_filter {
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalflatMap();
    }

    //filter
    public static void optionalFilter()
    {
             Optional.ofNullable(StudentDataBase.studentSupplier.get()) // Optional<Student>
                     .filter(student -> student.getGpa()>=3.5)
                     .ifPresent(student -> System.out.println(student));

    }

    //map
    public static void optionalMap()
    {
        Optional.ofNullable(StudentDataBase.studentSupplier.get()) // Optional<Student>
                .filter(student -> student.getGpa()>=3.5)
                .map(Student::getName)
                .ifPresent(student -> System.out.println(student));

    }

    //flatMap
    public static void optionalflatMap()
    {
        Optional.ofNullable(StudentDataBase.studentSupplier.get()) // Optional<Student>
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .ifPresent(System.out::println);
    }


}
