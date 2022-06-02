package Lambda_FunctionalInterface.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static List<Student> getAllStudents()
    {
        /**
        * 2nd grade student
        * */
        Student student1=new Student("Adam",2,3.6,"male", Arrays.asList("swimming","basketball","volleyball"));
        Student student2=new Student("Jenny",2,3.8,"female", Arrays.asList("swimming","gymnastics","soccer"));

        /**
         * 3nd grade student
         * */
        Student student3=new Student("Emily",3,4.0,"female", Arrays.asList("swimming","gymnastics","aerobics"));
        Student student4=new Student("Dave",3,3.9,"male", Arrays.asList("swimming","gymnastics","soccer"));

        /**
         * 4nd grade student
         * */
        Student student5=new Student("Sophia",4,3.5,"female", Arrays.asList("swimming","dancing","football"));
        Student student6=new Student("James",4,3.9,"male", Arrays.asList("swimming","basketball","baseball","football"));

        List<Student> Students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return  Students;
    }


    public static Supplier<Student> studentSupplier=()->{ return new Student("Andrew",4,4,"male",Arrays.asList("swimming","rugby","american football"));};
}
