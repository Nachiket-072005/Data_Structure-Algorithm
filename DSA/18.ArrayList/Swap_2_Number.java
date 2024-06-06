import java.util.*;

public class Swap_2_Number {
    public static void swap(int idx1, int idx2, ArrayList<Integer> list) {
        // Swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = 1, idx2 = 3;

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);

        // Before Swap
        System.out.println("Before Swap : ");
        System.out.println(list);
        // After Swap
        swap(idx1, idx2, list);
        System.out.println("After Swap : ");
        System.out.println(list);
    }
}