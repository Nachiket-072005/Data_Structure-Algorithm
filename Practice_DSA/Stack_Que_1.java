import java.util.Stack;

public class Stack_Que_1 {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();

        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder ans = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            ans.append(curr);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);

        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        String str = "abc";
        String ans = reverseStr(str);
        System.out.println(ans);
    }
}
