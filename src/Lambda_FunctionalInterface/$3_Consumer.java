package Lambda_FunctionalInterface;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class $3_Consumer {

    static Consumer<Student> names=(student -> System.out.print(student.getName()+" "));
    static Consumer<Student> activities=(student -> System.out.println(student.getActivities()));
    static List<Student> allStudents = StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        /** new functional interfaces in Java8
        * 1. Consumer
        * 2. Predicate
        * 3. Function
        * 4. Supplier
        */

        Consumer<String> con= (str)-> System.out.println(str.toUpperCase());
        con.accept("java dev");

        printName();
       // printNamesAndActivities();
        //printNamesAndActivitiesUsingCondition();
    }

    public static void printName()
    {
        Consumer<Student> consumerStudent=new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        };
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(consumerStudent);
    }

    public static  void printNamesAndActivities()
    {
        allStudents.forEach(names.andThen(activities));//consumer channing
    }
    public static  void printNamesAndActivitiesUsingCondition()
    {
        allStudents.forEach(student -> {
            if(student.getGpa()>=3.8)
                names.andThen(activities).accept(student);
        });
    }
}
