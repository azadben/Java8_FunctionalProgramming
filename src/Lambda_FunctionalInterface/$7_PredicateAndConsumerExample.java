package Lambda_FunctionalInterface;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class $7_PredicateAndConsumerExample {



    Predicate<Student> p1=(student)-> student.getGradeLevel()>=3;
    Predicate<Student> p2=(student)-> student.getGpa()>=3.8;

    //BiPredicate
    BiPredicate<Integer,Double> biPredicate=(gradeLevel,Gpa)-> gradeLevel>=3  &&Gpa>=3.8;

    BiConsumer<String,List<String>> biConsumer=(names,activities)->{System.out.println(names+" "+activities);};
    Consumer<Student> consumer=(student -> {
        //if(p1.and(p2).test(student))
        if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
        {
            biConsumer.accept(student.getName(),student.getActivities());
        }
    });

    public static void main(String[] args) {
        List<Student> getAllStudents=StudentDataBase.getAllStudents();

        $7_PredicateAndConsumerExample obj=new $7_PredicateAndConsumerExample();
        obj.printNamesAndActivities(getAllStudents);
    }
    public void printNamesAndActivities(List<Student> getAllStudents)
    {
        getAllStudents.forEach(consumer);
    }
}
