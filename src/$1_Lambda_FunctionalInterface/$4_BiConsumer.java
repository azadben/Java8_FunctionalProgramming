package $1_Lambda_FunctionalInterface;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class $4_BiConsumer {
    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer=(str1,str2)->{
            System.out.println(str1.concat(str2.toUpperCase()));
        };
        biConsumer.accept("azad","singh");


        BiConsumer<Integer,Integer> biConsumerMul=(num1,num2)->{
            System.out.print(num1*num2+" ");
        };
        BiConsumer<Integer,Integer> biConsumerDiv=(num1,num2)->{
            System.out.println(num1/num2);
        };
        biConsumerMul.andThen(biConsumerDiv).accept(20,10);


        printNamesAndActivity();
    }
    public static void printNamesAndActivity()
    {
        List<Student> allStudents= StudentDataBase.getAllStudents();
        BiConsumer<Student,Student> biConsumer=(x1,x2)->{
            System.out.println(x1.getName()+" "+x2.getActivities());
        };
        allStudents.forEach(students->biConsumer.accept(students,students));
    }
}
