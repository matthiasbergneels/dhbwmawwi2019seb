package datastructures;

public class Binarytree<D> {

    private Node<D> root = null;
    private int size = 0;

    public void insert(D data){
        if(data == null){
            return;
        }

        if(root == null){
            root = new Node<D>(data);
            size++;
            return;
        }

        // start der Rekursion
        insert(root, data);
    }

    private void insert(Node<D> currentNode, D data){

        int compareToResult = ((Comparable)currentNode.getData()).compareTo(data);

        if(compareToResult > 0){
            if(currentNode.getLeftNode() != null){
                insert(currentNode.leftNode, data);
            }else{
                size++;
                currentNode.setLeftNode(new Node<D>(data));
            }
        }else if(compareToResult < 0){
            if(currentNode.getRightNode() != null){
                insert(currentNode.getRightNode(), data);
            }else{
                size++;
                currentNode.setRightNode(new Node<D>(data));
            }
        }
    }

    public void printInOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
            return;
        }

        printInOrder(root);
    }

    private void printInOrder(Node<D> currentNode){
        if(currentNode.getLeftNode() != null){
            printInOrder(currentNode.getLeftNode());
        }

        System.out.println(currentNode.getData());

        if(currentNode.getRightNode() != null){
            printInOrder(currentNode.getRightNode());
        }
    }

    public boolean contains(D data){
        return contains(root, data);
    }

    private boolean contains(Node<D> currentNode, D data){
        if(currentNode == null){
            return false;
        }

        if(currentNode.getData().equals(data)){
            return true;
        }

        if(((Comparable)currentNode.getData()).compareTo(data) > 0){
            return contains(currentNode.getLeftNode(), data);
        }else{
            return contains(currentNode.getRightNode(), data);
        }
    }

    public int size(){
        return size;
    }

    private class Node<D>{

        private D data;
        private Node<D> leftNode;
        private Node<D> rightNode;

        public Node(D data){
            this.data = data;
        }

        public D getData(){
            return this.data;
        }

        public void setLeftNode(Node<D> leftNode){
            this.leftNode = leftNode;
        }

        public void setRightNode(Node<D> rightNode){
            this.rightNode = rightNode;
        }

        public Node<D> getLeftNode(){
            return this.leftNode;
        }

        public Node<D> getRightNode(){
            return this.rightNode;
        }

    }

}
