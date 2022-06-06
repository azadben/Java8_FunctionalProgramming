package Streams;

import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class $3_map {
    public static void main(String[] args)
    {

        System.out.println(getStudentName());
        System.out.println(getStudentNameInUpperCase());
    }
    public static List<String> getStudentName()
    {
        //storing all student names in a list
        List<String> studentName = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .collect(toList());

        return  studentName;
    }
    public static List<String> getStudentNameInUpperCase()
    {
        //storing all student names in a list
       return StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getName())
                .map(String::toUpperCase)
                .collect(toList());

    }
}
