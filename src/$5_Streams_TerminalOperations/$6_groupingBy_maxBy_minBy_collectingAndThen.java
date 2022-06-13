package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class $6_groupingBy_maxBy_minBy_collectingAndThen {
    public static void main(String[] args) {
        //calculateTopGpa();
        //calculateTopGpa_better();
        calculateBottomGpa_better();
    }

    //Print the student as per the GradeLevel who have max Gpa
    public static void calculateTopGpa()
    {
        Map<Integer, Optional<Student>> studentOptionalMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));

        studentOptionalMap.entrySet().forEach(System.out::println);
    }

    /** modifying above method, wrapping with collectingAndThen(Collector downstream,finisher)
    Params:
    downstream – a collector finisher – a function to be applied to the final result of the downstream collector
    Returns:
    a collector which performs the action of the downstream collector, followed by an additional finishing step  */
    public static void calculateTopGpa_better()
    {
        Map<Integer, Student> studentOptionalMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                       collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        studentOptionalMap.entrySet().forEach(System.out::println);
    }

    public static void calculateBottomGpa_better()
    {
        Map<Integer, Student> studentOptionalMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        studentOptionalMap.entrySet().forEach(System.out::println);
    }
}
