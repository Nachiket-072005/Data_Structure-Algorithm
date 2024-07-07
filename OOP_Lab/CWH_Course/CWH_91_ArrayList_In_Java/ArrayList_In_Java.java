import java.util.ArrayList;

public class ArrayList_In_Java {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l1.add(4);
        System.out.println(l1 + " " + l2);
        l1.addAll(0, l2);
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        System.out.println(l1.contains(4));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(4));
        l1.remove(4);
        System.out.println(l1);
    }
}