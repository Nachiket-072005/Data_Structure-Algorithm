import java.util.LinkedList;

public class LinkedList_Java {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l1.add(4);
        l1.addFirst(007);
        l1.addLast(14);
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