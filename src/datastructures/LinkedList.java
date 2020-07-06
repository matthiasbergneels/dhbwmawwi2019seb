package datastructures;

public class LinkedList<D> {

    private Node<D> firstNode = null;
    private int size = 0;

    public void add(D data){
        if(data == null){
            return;
        }

        Node<D> newNode = new Node<D>(data);
        size++;

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node<D> currentNode = this.firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

    public boolean remove(D data){
        if(firstNode != null){
            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                size--;
                return true;
            }

            Node<D> currentNode = firstNode;
            while(currentNode.getNextNode() != null){
                if(currentNode.getNextNode().getData().equals(data)){
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    size--;
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public int sizeWhile(){
        int counter = 0;
        Node<D> currentNode = firstNode;

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
        Node<D> currentNode = firstNode;

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
    private void printList(Node<D> currentNode){
        System.out.println(currentNode.getData());
        if(currentNode.getNextNode() != null){
            printList(currentNode.getNextNode());
        }
    }

    private class Node<D>{

        private D data;
        private Node nextNode;

        public Node(D data){
            this.data = data;
            nextNode = null;
        }

        public D getData(){
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
