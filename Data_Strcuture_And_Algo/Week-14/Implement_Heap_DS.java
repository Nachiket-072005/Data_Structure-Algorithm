import java.util.*;

public class Implement_Heap_DS {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        // By Default Min Heap - ASC. Order
        q.add(8);
        q.add(2);
        q.add(7);

        while (q.size() > 0) {
            System.out.println(q.peek());
            q.poll();
        }
    }
}