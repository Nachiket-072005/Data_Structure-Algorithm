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
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair<Integer, ListNode>> pq = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());

        for (ListNode list : lists) {
            if (list != null) {
                pq.add(new Pair<>(list.val, list));
            }
        }

        ListNode aH = null, aT = null;

        while (!pq.isEmpty()) {
            Pair<Integer, ListNode> topNode = pq.poll();

            if (aH == null) {
                aH = topNode.getValue();
                aT = topNode.getValue();
            } else {
                aT.next = topNode.getValue();
                aT = topNode.getValue();
            }

            if (topNode.getValue().next != null) {
                pq.add(new Pair<>(topNode.getValue().next.val, topNode.getValue().next));
            }

        }
        return aH;
    }
}