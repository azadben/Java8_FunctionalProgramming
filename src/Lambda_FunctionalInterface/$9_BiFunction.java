package Lambda_FunctionalInterface;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class $9_BiFunction {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction=(str1,str2)-> str1.concat(str2).toUpperCase();
        System.out.println(biFunction.apply("azad","singh"));




        BiFunction<List<Student>,Predicate<Student>, Map<String,Double>> mapBiFunction=(student,predicate)->{
            Map<String,Double> map=new HashMap<>();
            student.forEach(s->{
                if(predicate.test(s))
                    map.put(s.getName(),s.getGpa());
            });
              return map;
        };

        List<Student> allStudents = StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicate = s-> s.getGradeLevel()>=3;
        Map<String, Double> res = mapBiFunction.apply(allStudents, studentPredicate);
        res.entrySet().forEach(result-> System.out.println(result.getKey()+" "+result.getValue()));
    }
}
