package Lambda_FunctionalInterface;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class $8_Function {
    /**
     * interface Function<T, R>
     *  <T> – the type of the input to the function
     *  <R> – the type of the result of the function
     */

    static Function<String,String> function=(str)->str.toUpperCase();
    static Function<String,String> function1=(str)->str.concat("default");
    public static void main(String[] args)
    {
        System.out.println(function.apply("java8"));
        System.out.println(function.andThen(function1).apply("java8"));

        System.out.println(function.compose(function1).apply("java8"));
        //first function1 gets called, then output of function1 is passed in function..

        /** Streams Eg
         List<Student> allStudents = StudentDataBase.getAllStudents();
        List<Student> collect = allStudents.stream()
                .map(student -> {
                    int gradeLev=student.getGradeLevel();
                    student.setGradeLevel(gradeLev*10);
                    return student;
                })
                .collect(Collectors.toList());
        collect.forEach(student -> System.out.println(student));*/



        Function<List<Student>, Map<String,Double>> MapFunction=(student)->{

            Map<String,Double> map=new HashMap<>();

            student.forEach(s->{
                if($6_StudentPredicate.p1.test(s))
                    map.put(s.getName(),s.getGpa());
            });
            return map;
        };
        System.out.println(MapFunction.apply(StudentDataBase.getAllStudents()));

        }

}
