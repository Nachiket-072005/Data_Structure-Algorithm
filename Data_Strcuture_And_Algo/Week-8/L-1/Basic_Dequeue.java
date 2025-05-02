import java.util.Deque;
import java.util.LinkedList;

public class Basic_Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(7);
        dq.addLast(6);
        dq.addFirst(5);

        System.out.println(dq.getFirst());

        System.out.println(dq.getLast());

        System.out.println(dq.removeLast());

        System.out.println(dq.size());
        System.out.println(dq.removeFirst());
        System.out.println(dq.isEmpty());
    }
}
