package datastructures;

public class LinkedList {

    private Node firstNode = null;
    private int size = 0;

    public void add(Object data){
        Node newNode = new Node(data);
        size++;

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node currentNode = this.firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

    public boolean remove(Object data){

        return false;
    }

    public int size(){
        return size;
    }

    public int sizeWhile(){
        int counter = 0;
        Node currentNode = firstNode;

        while(currentNode != null){
            counter++;
            currentNode = currentNode.getNextNode();
        }

        return counter;
    }

    public int sizeDoWhile(){
        if(firstNode == null){
            return 0;
        }

        int counter = 1;
        Node currentNode = firstNode;

        do{
            counter++;
            currentNode = currentNode.getNextNode();
        }while(currentNode.getNextNode() != null);

        return counter;
    }

    public void printList(){
        if(firstNode == null){
            System.out.println("Die Liste ist leer!");
            return;
        }

        System.out.println("Ausgabe der Listenelemente:");
        printList(firstNode);
    }

    // rekursive Methode zur Listenausgabe
    private void printList(Node currentNode){
        System.out.println(currentNode.getData());
        if(currentNode.getNextNode() != null){
            printList(currentNode.getNextNode());
        }
    }

    private class Node{

        private Object data;
        private Node nextNode;

        public Node(Object data){
            this.data = data;
            nextNode = null;
        }

        public Object getData(){
            return this.data;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

    }

}
