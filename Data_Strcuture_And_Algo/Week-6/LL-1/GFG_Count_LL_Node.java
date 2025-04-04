class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node tmp = head;
        int count = 0;

        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
}
