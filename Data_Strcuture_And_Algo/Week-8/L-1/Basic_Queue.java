import java.util.*;

public class Basic_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(5);
        q.add(6);
        q.add(7);

        System.out.println(q.peek());

        q.remove();

        System.out.println(q.peek());

        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}