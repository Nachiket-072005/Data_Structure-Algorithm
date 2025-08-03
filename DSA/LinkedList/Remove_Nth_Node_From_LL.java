public class Remove_Nth_Node_From_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;

            if (fast == null) {
                return head.next;
            }
        }

        Node slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        Node delNode = slow.next;
        slow.next = delNode.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 2;
        Node res = removeNthFromEnd(head, n);

        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}
