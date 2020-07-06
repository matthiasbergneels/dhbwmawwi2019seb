package datastructures;

public class BinaryTreeExample {

    public static void main(String[] args) {

        Binarytree<Integer> numbersTree = new Binarytree<Integer>();

        System.out.println("Anzahl Element: " + numbersTree.size());

        numbersTree.insert(99);
        numbersTree.insert(67);
        numbersTree.insert(159);
        numbersTree.insert(42);
        numbersTree.insert(87);
        numbersTree.insert(25);
        numbersTree.insert(112);
        numbersTree.insert(112);
        numbersTree.insert(201);
        numbersTree.insert(112);

        System.out.println("Anzahl Element: " + numbersTree.size());

        System.out.println("Enthält 42: " + numbersTree.contains(42));
        System.out.println("Enthält 113: " + numbersTree.contains(113));

        numbersTree.printInOrder();

    }
}
