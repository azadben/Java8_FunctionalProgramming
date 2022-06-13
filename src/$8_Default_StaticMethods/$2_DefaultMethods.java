package $8_Default_StaticMethods;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class $2_DefaultMethods {
    public static void main(String[] args) {
        List<Student> allStudents =StudentDataBase.getAllStudents();
        System.out.println("Before sort: ");
        allStudents.forEach(System.out::println);

        System.out.println("Name sort: ");
        sortByName(allStudents);

        System.out.println("Gpa sort: ");
        sortByGpa(allStudents);

        System.out.println("After ComparatorChaning: ");
        comparatorChaning(allStudents);

        System.out.println("NullComparing: ");
        sortWithNullValues();
    }
    public static void sortByName( List<Student> allStudents)
    {
        Comparator<Student> nameComparator=Comparator.comparing(Student::getName);

        allStudents.sort(nameComparator);
        allStudents.forEach(System.out::println);
    }
    public static void sortByGpa( List<Student> allStudents)
    {
        Comparator<Student> gpaComparator=Comparator.comparingDouble(Student::getGpa);

        allStudents.sort(gpaComparator);
        allStudents.forEach(System.out::println);

    }

    public static void comparatorChaning( List<Student> allStudents)
    {
        Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
        Comparator<Student> gradeComparator=Comparator.comparingDouble(Student::getGradeLevel);

        allStudents.sort(gradeComparator.thenComparing(nameComparator));
        allStudents.forEach(System.out::println);

    }

    public static void sortWithNullValues()
    {
        List<String> stringList= Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric",null);

        Comparator<String> nameComparing = (str1,str2)-> str1.compareTo(str2);
       // Comparator<String> stringComparator = Comparator.nullsFirst(nameComparing);
        Comparator<String> stringComparator = Comparator.nullsLast(nameComparing);
        stringList.sort(stringComparator);
        stringList.forEach(System.out::println);

    }

}
