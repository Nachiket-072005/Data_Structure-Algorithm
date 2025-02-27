public class Que_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 4);
        System.out.println(r1.perimeter());
        System.out.println(r1.area());

        Square s1 = new Square(5);
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
    }
}

class Rectangle {
    int length;
    int breath;

    Rectangle(int l, int b) {
        length = l;
        breath = b;
    }

    public int perimeter() {
        return 2 * (length + breath);
    }

    public int area() {
        return length * breath;
    }
}

class Square extends Rectangle {
    Square(int l) {
        super(l, l);
    }
}