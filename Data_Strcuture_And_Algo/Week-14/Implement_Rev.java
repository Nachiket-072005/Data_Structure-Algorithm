import java.util.Collections;
import java.util.PriorityQueue;

public class Implement_Rev {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        // Max Heap - DESC. Order
        q.add(8);
        q.add(2);
        q.add(7);

        while (q.size() > 0) {
            System.out.println(q.peek());
            q.poll();
        }
    }
}
