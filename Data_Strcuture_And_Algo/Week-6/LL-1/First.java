class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class First {
    public static void main(String[] args) {
        Node head = new Node(5);

        Node newNode = new Node(6);

        head.next = newNode;

        System.out.println(head.data);
    }
}