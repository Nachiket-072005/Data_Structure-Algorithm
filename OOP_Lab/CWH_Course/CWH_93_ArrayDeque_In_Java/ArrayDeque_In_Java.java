import java.util.ArrayDeque;

public class ArrayDeque_In_Java {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.addFirst(0);
        System.out.println(ad1);
    }
}