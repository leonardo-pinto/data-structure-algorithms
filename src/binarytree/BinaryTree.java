package binarytree;

public class BinaryTree {

    Node root;

    public void insert(int value) {
        if (root == null) {
            this.root = new Node(value);
        } else {
            insertRecursive(root, value);
        }
    }

    public void insertRecursive(Node currentNode, int value) {

        if (value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = new Node(value);
            } else {
                insertRecursive(currentNode.right, value);
            }
        } else {
            if (currentNode.left == null) {
                currentNode.left = new Node(value);
            } else {
                insertRecursive(currentNode.left, value);
            }
        }
    }

    public void inOrder(){
        inOrderRecursive(root);
    }

    public void inOrderRecursive(Node root){
        if(root != null) {
            inOrderRecursive(root.left);
            System.out.println(root.value);
            inOrderRecursive(root.right);
        }
    }

}
