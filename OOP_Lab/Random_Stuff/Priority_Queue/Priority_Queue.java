import java.util.*;

class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(750);
        number.add(500);
        number.add(900);
        number.add(100);

        while (!number.isEmpty()) {
            System.out.println(number.remove());
        }
    }
}