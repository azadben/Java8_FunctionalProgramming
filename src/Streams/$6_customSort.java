package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class $6_customSort {
    public static void main(String[] args) {

        System.out.println("Sort by name: ");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Sort by GPA: ");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("sortStudentByGradeLevelAndGender: ");
        sortStudentByGenderAndGradeLevel().forEach(System.out::println);

        System.out.println("sortStudentByGenderAndGpa: ");
        sortStudentByGenderAndGpa().forEach(System.out::println);
    }
    public static List<Student> sortStudentByName()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
                // .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGpa()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                // .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGenderAndGradeLevel()
    {

       return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGender).thenComparing(Student::getGradeLevel))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByGenderAndGpa()
    {
        Comparator<Student> genderComparator=((s1,s2)->s1.getGender().compareTo(s2.getGender()));
        Comparator<Student> gpaComparator=((s1,s2)->Double.compare(s1.getGpa(),s2.getGpa()));
        Comparator<Student> gradeComparator=((s1,s2)->Integer.compare(s1.getGradeLevel(),s2.getGradeLevel()));

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(genderComparator.thenComparing(gpaComparator))
                .collect(Collectors.toList());
    }
}
