package datastructures;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList myNumberList = new LinkedList();

        System.out.println("Anzahl Elemente: " + myNumberList.size());
        myNumberList.printList();

        myNumberList.add(90);
        myNumberList.add(60);
        myNumberList.add(110);

        System.out.println("Anzahl Elemente: " + myNumberList.size());
        myNumberList.printList();
    }
}
