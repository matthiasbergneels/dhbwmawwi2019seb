package chapter8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> nameSet = new TreeSet<String>();

        nameSet.add("Horst");
        nameSet.add("Gabi");
        nameSet.add("Zeus");
        nameSet.add("Gabi");
        nameSet.add("Anna");

        System.out.println("Anzahl Namen: " + nameSet.size());

        System.out.println("For-Each Schleife - nameSet:");
        for(String name : nameSet){
            System.out.println(name);
        }


        nameSet.remove("Horst");
        System.out.println("Anzahl Namen: " + nameSet.size());

        System.out.println("Iterator Schleife - nameSet:");
        Iterator<String> nameSetIterator = nameSet.iterator();
        while(nameSetIterator.hasNext()){
            String name = nameSetIterator.next();
            System.out.println(name);
            if(name.equals("Gabi")){
                nameSetIterator.remove();
            }
        }

        System.out.println("Anzahl Namen: " + nameSet.size());

    }

}
