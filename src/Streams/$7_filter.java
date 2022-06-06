package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class $7_filter {

    public static void main(String[] args) {
        System.out.println("filterFemaleStudents: ");
        filterFemaleStudents().forEach(System.out::println);
    }
    public static List<Student> filterFemaleStudents()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(Collectors.toList());
    }
}
