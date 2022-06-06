package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Optional;

public class $13_findFirst_findAny {
    /**
     * used to find an element in the stream and both returns Optional
     * 1. findFirst() - returns 1st element as per find condition in the stream
     * 2. findAny() - returns 1st encountered element as per find condition in the stream
     *
     * */
    public static void main(String[] args) {
        System.out.println("findAny: "+findAny().get());
        System.out.println("findFirst: "+findFirst().get());
    }
    public static Optional<Student> findAny()
    {
       return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirst()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
}
