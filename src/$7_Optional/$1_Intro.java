package $7_Optional;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Optional;

public class $1_Intro {
    /**
     Optional -
     - It provides methods which are used to check the presence of value for particular variable.
     - used to avoid NullPointerException and Unnecessary Null checks
     */

    public static void main(String[] args) {

        String studentName = getStudentName();
        if(studentName!=null)
            System.out.println("Length of the student name: "+studentName.length());
        else
            System.out.println("Name not found");

        System.out.println("*************** Optional ********************************");

        Optional<String> studentNameOptional = getStudentNameOptional();
        if (studentNameOptional.isPresent())
            System.out.println("Length of the student name: "+studentNameOptional.get().length());
        else
            System.out.println("Name not found");


    }
    public static String getStudentName()
    {
        //without optional
        Student student = StudentDataBase.studentSupplier.get();
        if(student.getName()!=null)
            return student.getName();
        else
            return null;
    }
    public static Optional<String> getStudentNameOptional()
    {
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        if(optionalStudent.isPresent())
            return optionalStudent.map(Student::getName); //Optional<String>
        else
            return Optional.empty(); // Represents an Optional object with no value
    }
}
