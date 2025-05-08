import java.util.*;

public class Basic_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        // Map<Integer, Integer> m = new TreeMap<>();
        // Map<Integer, Integer> m = new LinkedHashMap()<>();
        m.put(1, 4);
        m.put(2, 7);

        System.out.println(m.get(1));
        System.out.println(m.get(2));

        for (HashMap.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        // System.out.println(m.size());

        for (Integer key : m.keySet()) {
            System.out.println(key + " --> " + m.get(key));
        }

        // Values
        for (Integer value : m.values()) {
            System.out.println(value);
        }
    }
}