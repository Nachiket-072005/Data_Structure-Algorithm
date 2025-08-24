import java.util.*;

public class Stack_Implement_Using_ArrayList {
    static class Stack {
        static List<Integer> s = new ArrayList<>();

        public static boolean isEmpty() {
            return s.size() == 0;
        }

        public static void push(int data) {
            s.add(data);
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }

            int pop = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            return pop;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            
            return s.get(s.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}