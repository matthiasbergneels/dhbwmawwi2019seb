package datastructures;

public class LinkedList {



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
