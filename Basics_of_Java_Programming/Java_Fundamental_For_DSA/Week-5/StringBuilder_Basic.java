public class StringBuilder_Basic {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");

        System.out.println(s);
        s.append("xyz");
        System.out.println(s);
        s.setCharAt(0, 'A');
        System.out.println(s.toString());
        System.out.println(s.length());
    }
}
