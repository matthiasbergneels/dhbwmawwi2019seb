package datastructures;

public class Stack<D> {

    Node<D> topNode = null;

    // lege ein Elememt auf dem Stack ab
    public void push(D data){
        topNode = new Node<D>(data, topNode);
    }

    // zeige das oberste Element
    public D peek(){
        return topNode.getData();
    }

    // nehme das oberste Element vom Stapel
    public D pop(){
        D data = topNode.getData();
        topNode = topNode.getLowerNode();
        return data;
    }

    private class Node<D>{

        private D data;
        private Node<D> lowerNode;

        public Node(D data, Node<D> lowerNode){
            this.data = data;
            this.lowerNode = lowerNode;
        }

        public Node<D> getLowerNode(){
            return this.lowerNode;
        }

        public D getData(){
            return this.data;
        }
    }

}
