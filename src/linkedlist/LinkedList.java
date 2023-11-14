package linkedlist;

public class LinkedList {
    Node head;

    // insertAtEnd
    public void insertAtEnd(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // insertAtStart
    public void insertAtStart(int value) {
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }


    // insertAt
    public void insertAt(int index, int value) {
        if (index == 0) {
            insertAtStart(value);
        } else {
            Node node = new Node(value);
            Node currNode = head;
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            node.next = currNode.next;
            currNode.next = node;
        }
    }

    // deleteAt
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currNode = head;
            for (int i = 0; i < index -1 ; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }
    }

    // show
    public void show() {
        if(head != null) {
            Node node = head;
            while (node.next != null) {
                System.out.println(node.value);
                node = node.next;
            }
            System.out.println(node.value);
        }
    }
}
