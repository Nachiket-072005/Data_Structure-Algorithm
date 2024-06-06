import java.util.*;

public class Max_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);

        // TC = O(n)
        for (int i = 0; i < list.size(); i++) {
            // First Method
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }
            // Second Method
            max = Math.max(max, list.get(i));
        }

        System.out.println("Maximum Value in an ArrayList : " + max);
    }
}