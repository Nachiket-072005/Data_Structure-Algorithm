class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class Que_3 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.side = 5;
        int area = s1.area();
        System.out.println(area);
        int perimeter = s1.perimeter();
        System.out.println(perimeter);
    }
}