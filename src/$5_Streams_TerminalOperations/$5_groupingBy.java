package $5_Streams_TerminalOperations;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class $5_groupingBy {
    /**
       groupingBy() collector is equivalent to the groupBy() operation in SQL
       -> it is used to group the elements based on the property being passed
       -> output of groupingBy() is going to be a Map<K,V>
       -> it has 3 versions a) groupingBy(classifier)
                            b) groupingBy(classifier,downstream) //downstream is another collector
                            c) groupingBy(classifier,supplier,downstream)

     **/
    public static void main(String[] args) {
        //groupStudentsByGender();
       // groupStudentsByGradeLevel();
        //customizedGroupingBy();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeArgumentGrouping();
    }
    public static void groupStudentsByGender()
    {
        Map<String, List<Student>> groupStudentsByGender = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println("groupStudentsByGender: \n"+groupStudentsByGender);
    }
    public static void groupStudentsByGradeLevel()
    {
        Map<Integer, List<Student>> groupStudentsByGradeLevel = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel));

        groupStudentsByGradeLevel.entrySet().forEach(System.out::println);
    }
    public static void customizedGroupingBy()
    {
        Map<String, List<Student>> customizedGroupingBy = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.9 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println("customizedGroupingBy: \n"+customizedGroupingBy);
    }
    public static void twoLevelGrouping_1()
    {
        Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.9 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println("twoLevelGrouping_1: \n"+twoLevelGrouping_1);
    }
    public static void twoLevelGrouping_2()
    {
        Map<String, Integer> twoLevelGrouping_2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));

        System.out.println("twoLevelGrouping_2: \n"+twoLevelGrouping_2);
    }
    public static void threeArgumentGrouping()
    {
        LinkedHashMap<String, Set<Student>> threeArgumentGrouping = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new,
                        Collectors.toSet()));

        System.out.println("threeArgumentGrouping: ");
        threeArgumentGrouping.entrySet().forEach(System.out::println);
    }
}
