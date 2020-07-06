package datastructures;

public class Binarytree<D> {


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
