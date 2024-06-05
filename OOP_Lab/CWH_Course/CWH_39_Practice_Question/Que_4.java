class Rectangle {
    int length, breath;

    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 4 * (length + breath);
    }
}

public class Que_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breath = 5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
