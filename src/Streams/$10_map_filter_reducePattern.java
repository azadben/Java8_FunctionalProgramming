package Streams;

import Lambda_FunctionalInterface.data.Student;
import Lambda_FunctionalInterface.data.StudentDataBase;

public class $10_map_filter_reducePattern {
    public static void main(String[] args) {
        System.out.println("noOfNoteBooks "+noOfNoteBooks());
        System.out.println("noOfNoteBooksFemale "+noOfNoteBooksFemale());
    }
    private static int noOfNoteBooks()
    {
         return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
               // .reduce(0, (s1, s2) -> s1 + s2);
                 .reduce(0,Integer::sum);

    }
    private static int noOfNoteBooksFemale()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                // .reduce(0, (s1, s2) -> s1 + s2);
                .reduce(0,Integer::sum);

    }
}
