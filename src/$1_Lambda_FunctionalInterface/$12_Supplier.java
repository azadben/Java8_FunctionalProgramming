package $1_Lambda_FunctionalInterface;

import $1_Lambda_FunctionalInterface.data.Student;
import $1_Lambda_FunctionalInterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class $12_Supplier {
    public static void main(String[] args) {
        //opposite to Consumer Interface
        Supplier<Student> studentSupplierSupplier=()-> new Student("Azad",4,4,"male", Arrays.asList("cricket","programming"));
        System.out.println(studentSupplierSupplier.get());

        Supplier<List<Student>> studentListSupplier = ()-> StudentDataBase.getAllStudents();
        System.out.println(studentListSupplier.get());

    }
}
