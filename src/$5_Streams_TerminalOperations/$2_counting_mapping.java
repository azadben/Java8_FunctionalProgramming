package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class $2_counting_mapping {
    /**
     * counting() - Collector returns the total number of elements as a result
     *
     * mapping() - collector applies a transformation function first and then collects the data
     *              in a collection(could be any type of collection)
     * */
    public static void main(String[] args) {
        System.out.println("counting: "+counting());

        System.out.println("mapping: "+mapping());

        System.out.println("mappingSet: "+mappingSet());
    }

    public static long counting()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static List<String> mapping()
    {
      return  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
    }
    public static Set<String> mappingSet()
    {
        return  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));
    }
}
