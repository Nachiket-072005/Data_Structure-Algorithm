public class Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.println(x + y); // 8
        System.out.println(x - y); // 2
        System.out.println(x * y); // 15
        System.out.println(x / y); // 1
        System.out.println(x % y); // 2

        x = 10;
        y = 5;

        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y); // true
        System.out.println(x < y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // false

        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false

        x = 5;
        y = 3;

        System.out.println(x > 3 && x < 10); // true
        System.out.println(y > 3 && y < 10); // true
        System.out.println(x > 3 || x < 4); // true
        System.out.println(y > 3 || y < 4); // true

        x = 5;
        y = 3;

        System.out.println(x += y); // 8
        System.out.println(x -= y); // 5
        System.out.println(x *= y); // 15
        System.out.println(x /= y); // 5
        System.out.println(x %= y); // 2
    }
}
