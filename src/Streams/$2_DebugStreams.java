package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class $2_DebugStreams {
    public static void main(String[] args)
    {
        //debuging using peek
        // stream passes the element one by one......
        Map<String, List<String>> nameAndActivitiesMap = StudentDataBase.getAllStudents()
                .stream()
                .peek(student -> System.out.println("After stream: "+student))
                .filter(student -> student.getGradeLevel()>=3)
                .peek(student -> System.out.println("After filter1 : "+student))
                .filter(student -> student.getGradeLevel()>=3.8)
                .peek(student -> System.out.println("After filter2 : "+student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Final output: "+nameAndActivitiesMap);
    }
}
