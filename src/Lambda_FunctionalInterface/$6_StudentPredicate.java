package Lambda_FunctionalInterface;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class $6_StudentPredicate {

    static Predicate<Student> p1=student -> student.getGradeLevel()>=3;

    static Predicate<Student> p2=student -> student.getGpa()>=3.8;
    static List<Student> studentList= StudentDataBase.getAllStudents();

    public static void main(String[] args)
    {
       filterStudentByGradeLevel();
       filterStudentByGpa();
       filterStudentByGradeLevelAndGpa();
    }

    public static void filterStudentByGradeLevel()
    {
        System.out.println("filterStudentByGradeLevel: ");
        studentList.forEach(s -> {
            if(p1.test(s))
            {
                System.out.println(s);
            }
        });
    }
    public static void filterStudentByGpa()
    {
        System.out.println("filterStudentByGpa: ");
        studentList.forEach(s -> {
            if(p2.test(s))
            {
                System.out.println(s);
            }
        });
    }
    public static void filterStudentByGradeLevelAndGpa() {
        System.out.println("filterStudentByGradeLevelAndGpa: ");
        studentList.forEach(s -> {
            if (p1.and(p2).test(s)) {
                System.out.println(s);
            }
        });
    }
}
