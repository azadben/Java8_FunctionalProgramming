package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class $4_flatMap {
    public static void main(String[] args) {
        List<String> activitiesList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(activitiesList);
    }
}
