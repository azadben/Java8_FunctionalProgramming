package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class $7_partitioningBy {
    /**
            partitioningBy() collector is also a kind of groupingBy()
       partitioningBy() - it accepts a predicate as an input and return type is a Map<K,V>
                        - the Key return type is a boolean
                        - 2 versions a) partitioningBy(predicate)
                                     b) partitioningBy(predicate,downstream)
     */
    public static void main(String[] args) {
    partitioningBy_1();
    partitioningBy_2();
    }
    public static void partitioningBy_1()
    {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;
        Map<Boolean, List<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));


        collect.entrySet().forEach(System.out::println);

    }
    public static void partitioningBy_2()
    {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;
        Map<Boolean, Set<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,Collectors.toSet()));


        collect.entrySet().forEach(System.out::println);

    }
}
