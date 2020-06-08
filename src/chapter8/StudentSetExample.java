package chapter8;

import java.util.Set;
import java.util.TreeSet;

public class StudentSetExample {

    public static void main(String[] args) {

        Set<Student> studentSet = new TreeSet<Student>();

        studentSet.add(new Student(1234, "Horst", "Mayer", 24));
        studentSet.add(new Student(6273, "Gabi", "Michel", 25));
        studentSet.add(new Student(9182, "Melanie", "Schmidt", 21));
        System.out.println(studentSet.add(new Student(7283, "Horst", "Mayer", 24)));
        studentSet.add(new Student(1723, "Franzi", "Hild", 23));
        System.out.println(studentSet.add(new Student(7283, "Horst", "Mayer", 22)));
        studentSet.add(new Student(6273, "Horst", "Mayer", 22));

        System.out.println("Anzahl Studierende: " + studentSet.size());

        for(Student student : studentSet){
            System.out.println("Student: " + student.getEnrollmentId() + " - " + student.getFamilyName() + "; " + student.getAge());
        }
    }
}
