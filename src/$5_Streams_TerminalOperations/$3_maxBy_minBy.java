package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class $3_maxBy_minBy {
    /**
     * maxBy() and minBy() takes a comparator as an input and Optional as an output
     */
    public static void main(String[] args) {
        System.out.println("minBy: "+minBy().get());

        System.out.println("maxBy: "+maxBy().get());
    }
    public static Optional<Student> minBy()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxBy()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
}
