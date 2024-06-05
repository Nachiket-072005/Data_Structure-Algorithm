class Circle {
    float r;

    public float area() {
        return 3.14f * r * r;
    }

    public float perimeter() {
        return 3.14f * r;
    }
}

public class Que_6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 14;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}