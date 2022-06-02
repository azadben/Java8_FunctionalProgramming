package MethodReference;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class $1_Function {
    public static void main(String[] args) {
        Function<String,String> methodReferenceExample=String::toUpperCase;
        System.out.println(methodReferenceExample.apply("hello world"));


       // Consumer<Student> studentConsumer=(student)-> System.out.println(student);
        Consumer<Student> studentConsumer= System.out::println;
        StudentDataBase.getAllStudents().forEach(studentConsumer);


    }
}
