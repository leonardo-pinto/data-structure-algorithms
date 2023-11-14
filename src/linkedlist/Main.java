package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtStart(9);
        list.insertAt(2, 99);
        list.deleteAt(2);
        list.show();
    }
}
