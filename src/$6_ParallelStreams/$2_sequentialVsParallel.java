package $6_ParallelStreams;

import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class $2_sequentialVsParallel {

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
    public static List<String> sequentialPrintStudentActivities()
    {
        long startTime=System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime=System.currentTimeMillis();
        System.out.println("sequentialPrintStudentActivities: "+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities()
    {
        long startTime=System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime=System.currentTimeMillis();
        System.out.println("parallelPrintStudentActivities: "+(endTime-startTime));
        return studentActivities;
    }

}
