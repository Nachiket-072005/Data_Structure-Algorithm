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

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode aH = null;
        ListNode aT = null;

        ListNode i = list1;
        ListNode j = list2;

        while (i != null && j != null) {
            ListNode minNode = null;
            if (i.val < j.val) {
                minNode = i;
                i = i.next;
            } else {
                minNode = j;
                j = j.next;
            }

            if (aH == null) {
                aH = minNode;
                aT = minNode;
            } else {
                aT.next = minNode;
                aT = minNode;
            }
        }

        if (i != null) {
            aT.next = i;
            aT = i;
        }
        if (j != null) {
            aT.next = j;
            aT = j;
        }

        return aH;
    }
}