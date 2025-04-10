/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base Case
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        // Recursive Case

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public ListNode mergeSort(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Middle element
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // prev is representing the node prev of middle node
        prev.next = null;

        // Divide the Linkedlist
        ListNode firstLinkedList = mergeSort(head);
        ListNode secondLinkedList = mergeSort(slow);

        // Merge the Linkedlist
        return mergeTwoLists(firstLinkedList, secondLinkedList);

    }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}