package datastructures;

import chapter5.Student;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> myNumberList = new LinkedList<Integer>();

        System.out.println("Anzahl Elemente: " + myNumberList.size());
        myNumberList.printList();

        myNumberList.add(90);
        myNumberList.add(60);
        myNumberList.add(110);
        //myNumberList.add(new Student(1236, "hhh", "hadkjh"));

        System.out.println("Anzahl Elemente: " + myNumberList.size());
        myNumberList.printList();

        myNumberList.remove(110);
        System.out.println("Anzahl Elemente: " + myNumberList.size());
        myNumberList.printList();

    }
}
