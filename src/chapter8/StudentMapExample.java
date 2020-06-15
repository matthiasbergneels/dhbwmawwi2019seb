package chapter8;

import java.util.*;

public class StudentMapExample {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(7893, new Student(7893, "Mayer-7893", "Gabi", 21));
        studentMap.put(8293, new Student(8293, "Mayer-8293", "Gabi", 21));
        studentMap.put(9827, new Student(9827, "Mayer-9827", "Gabi", 21));
        studentMap.put(1672, new Student(1672, "Mayer-1672", "Gabi", 21));
        studentMap.put(5627, new Student(5627, "Mayer-5627", "Gabi", 21));
        studentMap.put(4251, new Student(4251, "Mayer-4251", "Gabi", 21));

        System.out.println("Anzahl Studierende: " + studentMap.size());

        System.out.println("Studierende 9827: " + studentMap.get(9827).getFamilyName());

        studentMap.remove(1672);

        System.out.println("Studierende 5627: " + studentMap.get(5627).getFamilyName());
        studentMap.put(5627, new Student(9999, "Schmidt", "Franz", 33));
        System.out.println("Studierende 5627: " + studentMap.get(5627).getFamilyName());

        Set<Integer> studentKeys = studentMap.keySet();

        System.out.println("Ausgabe komplette Map über KeySet:");
        for(int enrollmentId : studentKeys){
            System.out.println(enrollmentId + ": " + studentMap.get(enrollmentId).getFamilyName());
        }

        System.out.println("Ausgabe komplette Map über Values:");
        Collection<Student> studentList = studentMap.values();
        for(Student s : studentList){
            System.out.println(s.getEnrollmentId() + ": " + s.getName());
        }

    }
}
