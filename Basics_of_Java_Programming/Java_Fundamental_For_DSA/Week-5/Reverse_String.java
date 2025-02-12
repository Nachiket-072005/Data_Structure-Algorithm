public class Reverse_String {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdef");

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }

        System.out.println(s);
    }
}
