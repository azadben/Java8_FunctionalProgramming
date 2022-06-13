package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.stream.Collectors;

public class $1_joining {
    /**
     *  Terminal Operations collects the data for you
     *  Terminal Operations starts the whole stream pipeline
     *  eg - forEach(), min(), max(), reduce(), collect()
     *  
     *  joining() - Collectors performs the String concatenation on the elements in the stream
     * */
    
    public static void main(String[] args) {
        System.out.println("joining_1: "+joining_1());

        System.out.println("joining_2: "+joining_2());

        System.out.println("joining_3: "+joining_3());
    }
    public static String joining_1()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String joining_2()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }
    public static String joining_3()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" - ","(",")"));
    }
}
