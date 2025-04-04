class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        }
        // code here
        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = newNode;

        return head;
    }
}