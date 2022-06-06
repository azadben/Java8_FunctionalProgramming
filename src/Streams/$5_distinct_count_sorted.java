package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class $5_distinct_count_sorted {
    /**
     * distinct - returns a stream with unique elements
     * count    - returns a long with the total no of elements in the stream
     * sorted   - sort the elements in the stream
    * */

    public static void main(String[] args) {
        List<String> distinctActicities = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(distinctActicities);


        long count = StudentDataBase.getAllStudents().stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);

    }
}
