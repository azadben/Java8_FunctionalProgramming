package $2_MethodReference;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class $1_Function {
    public static void main(String[] args) {
        Function<String,String> methodReferenceExample=String::toUpperCase;
        System.out.println(methodReferenceExample.apply("hello world"));


       // Consumer<Student> studentConsumer=(student)-> System.out.println(student);
        Consumer<Student> studentConsumer= System.out::println;
        StudentDataBase.getAllStudents().forEach(studentConsumer);


    }
}
