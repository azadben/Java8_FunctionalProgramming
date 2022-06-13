package $2_MethodReference;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.function.Predicate;

public class $2_RefactorMethodReferenceExample {

    static Predicate<Student> studentPredicate=$2_RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student student)
    {
        return student.getGradeLevel()>=3;
    }

    public static void main(String[] args)
    {
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
