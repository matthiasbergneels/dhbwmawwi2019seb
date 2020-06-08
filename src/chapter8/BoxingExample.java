package chapter8;

import chapter5.Student;

import java.util.ArrayList;
import java.util.List;

public class BoxingExample {

    public static void main(String[] args) {

        List myList = new ArrayList();

        myList.add("Tomaten");
        myList.add(new Student(13, "Müller", "Fritz"));

        // Auto-boxing --> umwandeln eines primitiven Datentyps in ein Object der Wrapperklasse
        myList.add(15);         // int --> Wrapperklasse Integer

        Integer number = new Integer(15);
        myList.add(number);

        myList.add(true);       // boolean --> Wrapperklasse Boolean
        myList.add(15.6);       // double --> Wrapperklasse Double


        for(Object listItem : myList){
            System.out.println(listItem);
        }


        List<Double> numbers = new ArrayList<Double>();

        // Auto-boxing
        numbers.add(3.14);
        numbers.add(42.42);
        numbers.add((double) 3);

        numbers.add(new Double(4.5));


        // Auto-unboxing --> Umwandlung vom Objekt der Wrapperklasse zu dem primitiven Datentyp
        for(double doubleNumber : numbers){
            System.out.println(doubleNumber);
        }


    }
}
