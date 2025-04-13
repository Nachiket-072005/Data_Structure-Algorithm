class Solution {
    public Node mergeKLists(Node[] lists) {
        int minVal = (int) (1e9);
        int idx = -1;

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].data < minVal) {
                minVal = lists[i].data;
                idx = i;
            }
        }

        if (idx == -1) {
            return null;
        }

        Node startingNode = lists[idx];
        lists[idx] = lists[idx].bottom;
        startingNode.bottom = mergeKLists(lists);
        return startingNode;
    }

    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        Node temp = root;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        Node lists[] = new Node[count];

        temp = root;
        int idx = 0;
        while (temp != null) {
            Node nxt = temp.next;
            temp.next = null;
            lists[idx] = temp;
            temp = nxt;
            idx++;
        }

        Node ans = mergeKLists(lists);
        return ans;
    }
}
