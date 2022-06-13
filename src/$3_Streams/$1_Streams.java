package $3_Streams;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class $1_Streams {
    public static void main(String[] args)
    {
        //1st way
        Function<Student,String> nameFunction=studentName-> studentName.getName();
        Function<Student, List<String>> activitiesFunction= studentActivities-> studentActivities.getActivities();
        Map<String, List<String>> nameAndActivitiesMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(nameFunction, activitiesFunction));
        nameAndActivitiesMap.entrySet().forEach(System.out::println);

        //2nd way using Method reference
        Map<String, List<String>> nameAndActivitiesMap1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        //using filter
        Map<String, List<String>> nameAndActivitiesMap2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGradeLevel()>=3.8)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println("nameAndActivitiesMap2:              ");
        nameAndActivitiesMap2.entrySet().forEach(System.out::println);
    }
}
