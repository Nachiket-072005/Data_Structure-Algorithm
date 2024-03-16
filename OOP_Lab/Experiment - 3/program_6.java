class point {
    private int x, y;

    point() {
        this.x = this.y = 5;
    }

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    point(point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.printf("Coords = (%d, %d)\n", this.x, this.y);
    }

}

public class program_6 {
    public static void main(String[] args) {
        point p1 = new point();
        point p2 = new point(4, 9);
        System.out.println("p1:");
        p1.display();
        System.out.println("p2:");
        p2.display();

        point p1_copy = new point(p1);
        point p2_copy = new point(p2);
        System.out.println("p1_copy:");
        p1_copy.display();
        System.out.println("p2_copy:");
        p2_copy.display();
    }
}