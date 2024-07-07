import java.util.HashSet;

public class HashSet_Java {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(1);
        System.out.println(myHashSet);
    }
}