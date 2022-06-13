package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.stream.Collectors;

public class $4_summingInt_averagingInt {
    /**
     *  summingInt() - this collector returns the sum as a result
     *
     *  averagingInt() - this collector returns the average as a result
     * */

    public static void main(String[] args) {
        System.out.println("summingInt: "+summingInt());

        System.out.println("averageInt: "+averageInt());
    }

    public static int summingInt() {
       return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getGradeLevel));
    }
    public static double averageInt() {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getGradeLevel));
    }
}
