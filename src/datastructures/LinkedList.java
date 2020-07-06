package datastructures;

public class LinkedList {

    private Node firstNode = null;

    public void add(Object data){
        Node newNode = new Node(data);

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

    public int size(){
        int counter = 0;
        Node currentNode = firstNode;

        do{
            counter++;
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
