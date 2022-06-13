package $3_Streams;

import $1_Lambda_FunctionalInterface.data.StudentDataBase;

public class $13_anyMatch_allMatch_noneMatch {

    /**
     * anyMatch() allMatch() noneMatch()
     * All these functions takes predicate as an input and return boolean as an output...................
     *
     * 1. anyMatch() -> Return true if any one of the element matches the predicate, otherwise false.(opposite to noneMatch() )
     * 2. allMatch() -> Return true if all the element matches the predicate, otherwise false.
     * 3. noneMatch() -> Return true if no element matches the predicate, otherwise false.(opposite to allMatch() )
     * */
    public static void main(String[] args) {
        System.out.println("allMatch: "+allMatch());
        System.out.println("anyMatch: "+anyMatch());
        System.out.println("noneMatch: "+noneMatch());
    }
    public static boolean allMatch()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }
    public static boolean anyMatch()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }
    public static boolean noneMatch()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa()>=3.9);
    }
}
