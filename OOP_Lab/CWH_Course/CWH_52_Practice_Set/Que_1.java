class Circle {
    int radius;

    Circle(int r) {
        this.radius = r;
    }

    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    int height;

    Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double calcVol() {
        return Math.PI * radius * radius * height;
    }
}

public class Que_1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(4, 5);
        System.out.println(c1.calcArea());
        System.out.println(c1.calcVol());
    }
}