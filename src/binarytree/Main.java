package binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(25);
        tree.insert(1);
        tree.insert(12);
        tree.inOrder();
    }
}
