package chapter8;

import chapter5.Car;
import chapter5.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<String>();

        String name = "Matilde";

        nameList.add("Klaus");
        nameList.add(name);
        nameList.add("Franz");
        nameList.add("Sandra");
        nameList.add("Franz");
        nameList.add(name);
        //nameList.add(new Student(1234, "Fritz", "Herbert"));

        System.out.println("Anzahl Namen in der Liste: " + nameList.size());

        System.out.println("Name Index 1: " + nameList.get(1));
        System.out.println("Name Index 3: " + nameList.get(3));

        nameList.add(3, "Michael");

        System.out.println("Name Index 3: " + nameList.get(3));
        System.out.println("Name Index 4: " + nameList.get(4));

        nameList.remove(4);
        System.out.println("Name Index 4: " + nameList.get(4));

        nameList.remove("Franz");
        System.out.println("Beinhaltet Franz: " + nameList.contains("Franz"));

        nameList.remove("Franz");
        System.out.println("Beinhaltet Franz: " + nameList.contains("Franz"));


        System.out.println("For Schleife:");
        for(int i = 0; i < nameList.size(); i++){
            String myName = nameList.get(i);
            System.out.println("Index: " + i + " - " + myName);
        }

        System.out.println("For-Each Schleife: ");
        for(String myName : nameList){
            //String myName2 = (String)myName;
            System.out.println(myName);
        }

        System.out.println("Iterator: ");
        Iterator<String> nameListIterator = nameList.iterator();
        while(nameListIterator.hasNext()){
            String myName = nameListIterator.next();
            System.out.println(myName);
            if(myName.equals("Michael")){
                nameListIterator.remove();
                System.out.println("Michael gelöscht!");
            }
        }

        System.out.println("Anzahl Namen in der Liste: " + nameList.size());

        nameList.clear();
        System.out.println("Anzahl Namen in der Liste: " + nameList.size());
    }

}
