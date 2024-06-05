import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9); // O(n)
        System.out.println(list);

        // Get Element - O(1)
        int el = list.get(2);
        System.out.println(el);

        // Remove Element - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at Index - O(n)
        list.set(2, 10);
        System.out.println(list);

        // Contains Element - O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));
    }
}