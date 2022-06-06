package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Optional;

public class $9_reduce {
    public static void main(String[] args) {

        Optional<Student> highestStudentGpa = StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> {
                    if (s1.getGpa() > s2.getGpa())
                        return s1;
                    else
                        return s2;
                });
        if(highestStudentGpa.isPresent())
            System.out.println(highestStudentGpa.get().getName()+" "+highestStudentGpa.get().getGpa());

    }
}
